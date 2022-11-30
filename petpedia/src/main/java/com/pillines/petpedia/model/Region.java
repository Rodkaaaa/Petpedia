package com.pillines.petpedia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "region")
public class Region {
    @Id
    @GeneratedValue()
    private Integer idRegion;
    private String nombreRegion;
    private String ordinal;

    @OneToMany(mappedBy = "region", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Provincia> provincia;

    public Region() {
    }

    public Region(Integer idRegion, String nombreRegion, String ordinal) {
        this.idRegion = idRegion;
        this.nombreRegion = nombreRegion;
        this.ordinal = ordinal;
    }

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
