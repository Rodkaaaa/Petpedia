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
public class Comuna {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idComuna;
    @Column(name = "nombre_comuna", nullable = false, unique = true)
    private String nombreComuna;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_provincia", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Provincia provincia;

    public Comuna() {
    }

    public Comuna(Integer idComuna, String nombreComuna, Provincia provincia) {
        this.idComuna = idComuna;
        this.nombreComuna = nombreComuna;
        this.provincia = provincia;
    }

    public Integer getId() {
        return this.idComuna;
    }

    public void setId(Integer idComuna) {
        this.idComuna = idComuna;
    }

    public String getNombreComuna() {
        return this.nombreComuna;
    }

    public void setNombreComuna(String nombreComuna) {
        this.nombreComuna = nombreComuna;
    }

    public Provincia getProvincia() {
        return this.provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }


}
