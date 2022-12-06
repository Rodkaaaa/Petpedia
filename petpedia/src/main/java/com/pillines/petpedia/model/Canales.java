package com.pillines.petpedia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//clase
@Entity()
public class Canales {
    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // que mi dato no nulo y que unico
    @Column(nullable = false, unique = true)
    private String nombreCanal;// nombre_canal
    @Column(nullable = false, unique = true)
    private String siglas;
    // relacion
    @OneToMany(mappedBy = "canales", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Usuario> usuario;

    // constructores
    public Canales() {
    }

    public Canales(Integer id, String nombreCanal, String siglas) {
        this.id = id;
        this.nombreCanal = nombreCanal;
        this.siglas = siglas;
    }

    // Getter y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCanal() {
        return nombreCanal;
    }

    public void setNombreCanal(String nombreCanal) {
        this.nombreCanal = nombreCanal;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

}
