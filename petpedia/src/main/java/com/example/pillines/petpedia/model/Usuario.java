package com.example.pillines.petpedia.model;

import java.util.Date;

import javax.persistence.Column;
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

@Entity(name = "usuario")
class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario",nullable = false)
    private Integer id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(name = "nombre_usuario",nullable = false)
    private String nombreUsuario;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(name = "status_usuario",nullable = false)
    private boolean statusUsuario;
    @Column(name = "usuario_direccion",nullable = false)
    private String direccion;
    @Column(name = "usuario_creacion",nullable = false)
    private Date fechaCreacion;
    @Column()
    private int puntacion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_comuna", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Comuna comuna;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipo_usuario", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private TipoUsuario tipoUsuario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_servicio", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Servicio servicio;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_canales", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Canales canales;


    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String apellido, String nombreUsuario, String email, String password, boolean statusUsuario, String direccion, Date fechaCreacion, int puntacion, Comuna comuna, TipoUsuario tipoUsuario, Servicio servicio, Canales canales) {
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
        this.comuna = comuna;
        this.tipoUsuario = tipoUsuario;
        this.servicio = servicio;
        this.canales = canales;
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

    public Comuna getComuna() {
        return this.comuna;
    }

    public void setComuna(Comuna comuna) {
        this.comuna = comuna;
    }

    public TipoUsuario getTipoUsuario() {
        return this.tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Servicio getServicio() {
        return this.servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Canales getCanales() {
        return this.canales;
    }

    public void setCanales(Canales canales) {
        this.canales = canales;
    }

}
