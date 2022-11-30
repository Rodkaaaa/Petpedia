package com.pillines.petpedia.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "post") 
public class Post {
    @Id
    @GeneratedValue()
    private Integer id;
    private String titulo;
    private String contenido;
    private String url;
    private Date creacionPost;
    private boolean statusPost;
    private int puntuacion;

    @ManyToOne()
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne()
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;


    public Post() {
    }

    public Post(Integer id, String titulo, String contenido, String url, Date creacionPost, boolean statusPost, int puntuacion, Usuario usuario, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.url = url;
        this.creacionPost = creacionPost;
        this.statusPost = statusPost;
        this.puntuacion = puntuacion;
        this.usuario = usuario;
        this.categoria = categoria;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return this.contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreacionPost() {
        return this.creacionPost;
    }

    public void setCreacionPost(Date creacionPost) {
        this.creacionPost = creacionPost;
    }

    public boolean isStatusPost() {
        return this.statusPost;
    }

    public boolean getStatusPost() {
        return this.statusPost;
    }

    public void setStatusPost(boolean statusPost) {
        this.statusPost = statusPost;
    }

    public int getPuntuacion() {
        return this.puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
}
