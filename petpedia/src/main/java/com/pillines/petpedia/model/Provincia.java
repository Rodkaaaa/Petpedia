package com.pillines.petpedia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

//clase
@Entity(name = "provincia")
public class Provincia {
    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProvincia;
    private String nombreProvincia;
    // Relaciones
    @OneToMany(mappedBy = "provincia", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Comuna> comuna;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_region")
    private Region region;

    // constructores
    public Provincia() {
    }

    public Provincia(Integer idProvincia, String nombreProvincia, Region region) {
        this.idProvincia = idProvincia;
        this.nombreProvincia = nombreProvincia;
        this.region = region;
    }
    // Getter y Setters

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
