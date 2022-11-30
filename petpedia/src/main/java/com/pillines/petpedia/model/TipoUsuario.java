package com.pillines.petpedia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "tipoUsuario")
public class TipoUsuario {

    @Id
    @GeneratedValue()
    private Integer id;
    private String tipoUsuario;

    @OneToMany(mappedBy = "tipoUsuario", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Usuario> usuario;

    public TipoUsuario() {
    }

    public TipoUsuario(Integer id, String tipoUsuario) {
        this.id = id;
        this.tipoUsuario = tipoUsuario;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoUsuario() {
        return this.tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}