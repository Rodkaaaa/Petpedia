package com.example.pillines.petpedia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "region")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = true, name = "idRegion")
    private Integer id;
    @Column(name = "nombre_region", unique = true, nullable = true)
    private String nombreRegion;
    @Column(name = "ordinal", nullable = true, unique = true)
    private String ordinal;

    public Region() {
    }

    public Region(Integer id, String nombreRegion, String ordinal) {
        this.id = id;
        this.nombreRegion = nombreRegion;
        this.ordinal = ordinal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    public String getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(String ordinal) {
        this.ordinal = ordinal;
    }
}
