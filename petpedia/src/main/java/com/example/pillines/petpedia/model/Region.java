package com.example.pillines.petpedia.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity()
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idRegion;
    @Column(name = "nombre_region", unique = true, nullable = false)
    private String nombreRegion;
    @Column(name = "ordinal", nullable = false, unique = true)
    private String ordinal;

    @OneToOne(mappedBy = "region")
    private Provincia Provincia;

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
