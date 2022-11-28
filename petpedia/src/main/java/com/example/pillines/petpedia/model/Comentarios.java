package com.example.pillines.petpedia.model;

import javax.persistence.Column;

// HOLA A TODOS SOY YOOOOOOOOOOO
// xdxd

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "comentario")

public class Comentarios {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idComentarios", nullable = false)
    private Integer id;
    @Column(name = "titulo_comentario", nullable = false)
    private String tituloComentario;
    private String comentarioText;
    private int statusComentario;
    private int puntacion;

    
    public Comentarios() {
    }


    public Comentarios(Integer id, String tituloComentario, String comentarioText, int statusComentario,
            int puntacion) {
        this.id = id;
        this.tituloComentario = tituloComentario;
        this.comentarioText = comentarioText;
        this.statusComentario = statusComentario;
        this.puntacion = puntacion;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getTituloComentario() {
        return tituloComentario;
    }


    public void setTituloComentario(String tituloComentario) {
        this.tituloComentario = tituloComentario;
    }


    public String getComentarioText() {
        return comentarioText;
    }


    public void setComentarioText(String comentarioText) {
        this.comentarioText = comentarioText;
    }


    public int getStatusComentario() {
        return statusComentario;
    }


    public void setStatusComentario(int statusComentario) {
        this.statusComentario = statusComentario;
    }


    public int getPuntacion() {
        return puntacion;
    }


    public void setPuntacion(int puntacion) {
        this.puntacion = puntacion;
    }


    
}
