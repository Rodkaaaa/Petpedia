package com.pillines.petpedia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "comuna")
public class Comuna {
    @Id
    @GeneratedValue()
    private Integer idComuna;
    private String nombreComuna;

    @ManyToOne(fetch = FetchType.EAGER )
    @JoinColumn(name = "id_provincia")
    private Provincia provincia;

    @OneToMany(mappedBy = "comuna", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Usuario> usuario;

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
