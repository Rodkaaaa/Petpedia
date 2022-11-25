package com.example.pillines.petpedia.model;

public class Canales {
    private Integer id;
    private String nombreCanal;
    private String siglas;


    public Canales() {
    }

    public Canales(Integer id, String nombreCanal, String siglas) {
        this.id = id;
        this.nombreCanal = nombreCanal;
        this.siglas = siglas;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCanal() {
        return this.nombreCanal;
    }

    public void setNombreCanal(String nombreCanal) {
        this.nombreCanal = nombreCanal;
    }

    public String getSiglas() {
        return this.siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

}
