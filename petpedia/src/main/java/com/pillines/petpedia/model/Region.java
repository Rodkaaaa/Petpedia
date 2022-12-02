package com.pillines.petpedia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//clase
@Entity(name = "region")
public class Region {
    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRegion;
    private String nombreRegion;
    private String ordinal;
    // Relaciones
    @OneToMany(mappedBy = "region", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Provincia> provincia;

    // constructores
    public Region() {
    }

    public Region(Integer idRegion, String nombreRegion, String ordinal) {
        this.idRegion = idRegion;
        this.nombreRegion = nombreRegion;
        this.ordinal = ordinal;
    }
    // Getter y Setters

    public Integer getId() {
        return idRegion;
    }

    public void setId(Integer idRegion) {
        this.idRegion = idRegion;
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
