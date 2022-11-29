package com.example.pillines.petpedia.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity()
public class Provincia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idProvincia;
    @Column(name = "nombre_provincia", nullable = false, unique = true)
    private String nombreProvincia;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_region", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Region region;

    public Provincia() {
    }

    public Provincia(Integer idProvincia, String nombreProvincia, Region region) {
        this.idProvincia = idProvincia;
        this.nombreProvincia = nombreProvincia;
        this.region = region;
    }

    public Integer getId() {
        return idProvincia;
    }

    public void setId(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public Region getRegion() {
        return this.region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

}
