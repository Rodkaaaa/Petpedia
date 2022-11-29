package com.pillines.petpedia.model;



// HOLA A TODOS SOY YOOOOOOOOOOO
// xdxd

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "comentario")

public class Comentarios {
    @Id
    @GeneratedValue()
    private Integer id;
    private String tituloComentario;
    private String comentarioText;
    private int statusComentario;
    private int puntacion;

    @ManyToOne()
    @JoinColumn(name = "id_usuarios")
    private Post post;


    public Comentarios() {
    }

    public Comentarios(Integer id, String tituloComentario, String comentarioText, int statusComentario, int puntacion, Post post) {
        this.id = id;
        this.tituloComentario = tituloComentario;
        this.comentarioText = comentarioText;
        this.statusComentario = statusComentario;
        this.puntacion = puntacion;
        this.post = post;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTituloComentario() {
        return this.tituloComentario;
    }

    public void setTituloComentario(String tituloComentario) {
        this.tituloComentario = tituloComentario;
    }

    public String getComentarioText() {
        return this.comentarioText;
    }

    public void setComentarioText(String comentarioText) {
        this.comentarioText = comentarioText;
    }

    public int getStatusComentario() {
        return this.statusComentario;
    }

    public void setStatusComentario(int statusComentario) {
        this.statusComentario = statusComentario;
    }

    public int getPuntacion() {
        return this.puntacion;
    }

    public void setPuntacion(int puntacion) {
        this.puntacion = puntacion;
    }

    public Post getPost() {
        return this.post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
    
}
