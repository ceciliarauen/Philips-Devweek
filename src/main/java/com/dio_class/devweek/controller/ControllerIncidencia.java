package com.dio_class.devweek.controller;

import com.dio_class.devweek.entidades.Incidencia;
import com.dio_class.devweek.repo.IncidenciaRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;



    @RestController
    @RequestMapping("/api")
    public class ControllerIncidencia {
        private final IncidenciaRepo ocRepository;

        public ControllerIncidencia(IncidenciaRepo ocRepository) {
            this.ocRepository = ocRepository;
        }

        @GetMapping("/incidencia")
        public ResponseEntity<List<Incidencia>> findIncidencias() {
            List<Incidencia> listaOcorrencia = ocRepository.findAll();
            if (listaOcorrencia.isEmpty())
                return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
            return new ResponseEntity<>(listaOcorrencia, HttpStatus.OK);
        }

        @GetMapping("/incidencia/{id}")
        public ResponseEntity<Incidencia> findIncidenciasById(@PathVariable Long id) {
            Optional<Incidencia> incidenciaOptional = ocRepository.findById(id);
            if (incidenciaOptional.isPresent()) {
                Incidencia ocorrenciaUnid = incidenciaOptional.get();
                return new ResponseEntity<>(ocorrenciaUnid, HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


