package com.example.pillines.petpedia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tipoUsuario")
class TipoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoUsuario")
    private Integer id;
    @Column(name = "tipoUsuario", nullable = false, unique = true)
    private String tipoUsuario;
  

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