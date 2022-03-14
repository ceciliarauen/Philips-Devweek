package com.dio_class.devweek.entidades;

import javax.persistence.*;

@Entity
public class Incidencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Long regiao_id;
    private Long mes;
    private String faixa_id;
    private Integer qnt_exames;

    public Incidencia(Long id, Long regiao_id, Long mes, String faixa_id, Integer qnt_exames) {
        this.id = id;
        this.regiao_id = regiao_id;
        this.mes = mes;
        this.faixa_id = faixa_id;
        this.qnt_exames = qnt_exames;
    }

    public Incidencia(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRegiao_id() {
        return regiao_id;
    }

    public void setRegiao_id(Long regiao_id) {
        this.regiao_id = regiao_id;
    }

    public Long getMes() {
        return mes;
    }

    public void setMes(Long mes) {
        this.mes = mes;
    }

    public String getFaixa_id() {
        return faixa_id;
    }

    public void setFaixa_id(String faixa_id) {
        this.faixa_id = faixa_id;
    }

    public Integer getQnt_exames() {
        return qnt_exames;
    }

    public void setQnt_exames(Integer qnt_exames) {
        this.qnt_exames = qnt_exames;
    }
}
