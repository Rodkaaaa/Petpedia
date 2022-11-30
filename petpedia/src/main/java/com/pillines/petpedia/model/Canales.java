package com.pillines.petpedia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity()
public class Canales {
    // id
    @Id
    @GeneratedValue()
    private Integer id;
    private String nombreCanal;
    private String siglas;

    @OneToMany(mappedBy = "canales", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Usuario> usuario;

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
