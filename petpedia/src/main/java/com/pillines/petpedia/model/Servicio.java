package com.pillines.petpedia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity(name = "servicio")
public class Servicio {
    @Id
    @GeneratedValue()
    private Integer id;
    private String tipoServicio;
    private String descripcion;

    @OneToMany(mappedBy = "servicio", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Usuario> usuario;

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
