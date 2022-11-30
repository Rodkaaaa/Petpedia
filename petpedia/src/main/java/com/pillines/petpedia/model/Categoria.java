package com.pillines.petpedia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//rickyrickon
//123
//Howolaass
//javierklo
//rickymartin
@Entity(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue()
    private Integer id;
    private String nombreCategoria;

    public Categoria() {
    }

    public Categoria(Integer id, String nombreCategoria) {
        this.id = id;
        this.nombreCategoria = nombreCategoria;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCategoria() {
        return this.nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

}
