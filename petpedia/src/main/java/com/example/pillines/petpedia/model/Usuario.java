package com.example.pillines.petpedia.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "usuario")
class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario",nullable = true)
    private Integer id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(name = "nombre_usuario",nullable = false)
    private String nombreUsuario;
    @Column(nullable = true)
    private String email;
    @Column(nullable = true)
    private String password;
    @Column(name = "status_usuario",nullable = true)
    private boolean statusUsuario;
    @Column(name = "usuario_direccion",nullable = true)
    private String direccion;
    @Column(name = "usuario_creacion",nullable = true)
    private Date fechaCreacion;
    @Column()
    private int puntacion;


    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String apellido, String nombreUsuario, String email, String password, boolean statusUsuario, String direccion, Date fechaCreacion, int puntacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
        this.statusUsuario = statusUsuario;
        this.direccion = direccion;
        this.fechaCreacion = fechaCreacion;
        this.puntacion = puntacion;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatusUsuario() {
        return this.statusUsuario;
    }

    public boolean getStatusUsuario() {
        return this.statusUsuario;
    }

    public void setStatusUsuario(boolean statusUsuario) {
        this.statusUsuario = statusUsuario;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getPuntacion() {
        return this.puntacion;
    }

    public void setPuntacion(int puntacion) {
        this.puntacion = puntacion;
    }


}
