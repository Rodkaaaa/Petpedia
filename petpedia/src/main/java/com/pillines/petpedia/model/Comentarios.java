package com.pillines.petpedia.model;

import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//clase
@Entity(name = "comentario")

public class Comentarios {
    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String tituloComentario;
    @Column(nullable = false)
    private String comentarioText;
    private int statusComentario;
    private int puntacion;
    private Date fechaComentario;
    // Relaciones
    @ManyToOne()
    @JoinColumn(name = "id_usuarios", nullable = false)
    private Post post;

    // constructores
    public Comentarios() {
    }

    public Comentarios(Integer id, String tituloComentario, String comentarioText, int statusComentario, int puntacion, Date fechaComentario,
            Post post) {
        this.id = id;
        this.tituloComentario = tituloComentario;
        this.comentarioText = comentarioText;
        this.statusComentario = statusComentario;
        this.puntacion = puntacion;
        this.fechaComentario = fechaComentario;
        this.post = post;
    }
    // Getter y Setters


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

    public Date getFechaComentario() {
        return fechaComentario;
    }

    public void setFechaComentario(Date fechaComentario) {
        this.fechaComentario = fechaComentario;
    }
    
    public Post getPost() {
        return this.post;
    }

    public void setPost(Post post) {
        this.post = post;
    }


}
