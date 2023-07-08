package com.example.TCMFriend.Entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;


@Entity
@Table(name = "usuario")

public class Usuario {

    @Id
    @Column(name="usuario_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int usuarioid;

    @Column(name="usuario_nombre", length = 50)
    private String nombre;
    
    @Column(name="usuario_apellido", length = 50)
    private String apellido;

    @Column(name="usuario_email", length = 50, unique = true)
    private String email;

    @Column(name="usuario_password", length = 200)
    private String password;
    
    @Column(name="usuario_ciclo", length = 10)
    private String ciclo;
    
    @Column(name="usuario_carrera", length = 50)
    private String carrera;
    
    @Column(name="usuario_descripcion", length = 300)
    private String descripcion;
    
	public Usuario() {
		super();
	}

	public Usuario(int usuarioid, String nombre, String apellido, String email, String password, String ciclo,
			String carrera, String descripcion) {
		super();
		this.usuarioid = usuarioid;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.ciclo = ciclo;
		this.carrera = carrera;
		this.descripcion = descripcion;
	}

	public int getUsuarioid() {
		return usuarioid;
	}

	public void setUsuarioid(int usuarioid) {
		this.usuarioid = usuarioid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Usuario [usuarioid=" + usuarioid + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", password=" + password + ", ciclo=" + ciclo + ", carrera=" + carrera + ", descripcion="
				+ descripcion + "]";
	}
    
    /**@OneToMany(cascade = CascadeType.ALL,mappedBy = "usuario")
    @JsonIgnore()
    private Set<Publicacion> publicacion;*/
    
    

}