package com.pillines.petpedia.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

//clase
@Entity(name = "usuario")
public class Usuario {
    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(nullable = false, unique = true) // nullable= false que no sea nulo , unique = true que sea unico
    private String nombreUsuario;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private boolean statusUsuario;
    private String direccion;
    @Column(nullable = false)
    private Date fechaCreacion;
    private int puntacion;
    // Relaciones
    @ManyToOne()
    @JoinColumn(name = "id_comuna", nullable = false)
    private Comuna comuna;

    @ManyToOne()
    @JoinColumn(name = "id_tipo_usuario", nullable = false)
    private TipoUsuario tipoUsuario;

    @ManyToOne()
    @JoinColumn(name = "id_servicios", nullable = false)
    private Servicio servicio;

    @ManyToOne()
    @JoinColumn(name = "id_canales", nullable = false)
    private Canales canales;
    // no va dentro del constructor
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Post> post;

    // constructores
    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String apellido, String nombreUsuario, String email, String password,
            boolean statusUsuario, String direccion, Date fechaCreacion, int puntacion, Comuna comuna,
            TipoUsuario tipoUsuario, Servicio servicio, Canales canales) {
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
    // Getter y Setters

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
