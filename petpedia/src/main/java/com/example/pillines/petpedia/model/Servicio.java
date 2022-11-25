package com.example.pillines.petpedia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "servicio")
public class Servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idServicion", nullable = false)
    private Integer id;
    @Column(name = "tipoServicio", nullable = false, unique = true )
    private String tipoServicio;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;


    public Servicio() {
    }

    public Servicio(Integer id, String tipoServicio, String descripcion) {
        this.id = id;
        this.tipoServicio = tipoServicio;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoServicio() {
        return this.tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
