package com.example.pillines.petpedia.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Comuna {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCommuna", nullable = true)
    private Integer id;
    @Column(name = "nombre_provincia", nullable = true, unique = true)
    private String nombreComuna;

    public Comuna() {
    }

    public Comuna(Integer id, String nombreComuna) {
        this.id = id;
        this.nombreComuna = nombreComuna;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreComuna() {
        return this.nombreComuna;
    }

    public void setNombreComuna(String nombreComuna) {
        this.nombreComuna = nombreComuna;
    }

}
