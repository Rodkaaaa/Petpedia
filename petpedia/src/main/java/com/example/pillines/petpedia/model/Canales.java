package com.example.pillines.petpedia.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Canales {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCanales", nullable = false)
    private Integer id;
    @Column(name = "nombre_canal", nullable = false, unique = true)
    private String nombreCanal;
    @Column(name = "siglas", nullable = true)
    private String siglas;
    
    public Canales() {
    }

    public Canales(Integer id, String nombreCanal, String siglas) {
        this.id = id;
        this.nombreCanal = nombreCanal;
        this.siglas = siglas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCanal() {
        return nombreCanal;
    }

    public void setNombreCanal(String nombreCanal) {
        this.nombreCanal = nombreCanal;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }
    
}
