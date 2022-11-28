package com.example.pillines.petpedia.model;

import javax.persistence.Column;

// HOLA A TODOS SOY YOOOOOOOOOOO
// xdxd

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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_post", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
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
