package com.example.pillines.petpedia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "provincia")
public class Provincia {
    @Id
    @Column(name = "idProvincia", nullable = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "nombre_columna", nullable = true, unique = true)
    private String nombreProvincia;

    public Provincia() {
    }

    public Provincia(Integer id, String nombreProvincia) {
        this.id = id;
        this.nombreProvincia = nombreProvincia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }
}
