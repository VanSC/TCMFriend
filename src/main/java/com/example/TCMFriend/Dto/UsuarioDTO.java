package com.example.TCMFriend.Dto;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;


public class UsuarioDTO {

    private int usuarioid;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private String ciclo;
    private String carrera;
    private String descripcion;

    
	public UsuarioDTO(int usuarioid, String nombre, String apellido, String email, 
			String password, String ciclo, String carrera, String descripcion) {

		this.usuarioid = usuarioid;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.ciclo = ciclo;
		this.carrera = carrera;
		this.descripcion = descripcion;
	}

	public UsuarioDTO() {

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
		return "UsuarioDTO [usuarioid=" + usuarioid + ", nombre=" + nombre + ", apellido=" + apellido + ", email="
				+ email + ", password=" + password + ", ciclo=" + ciclo + ", carrera=" + carrera + ", descripcion="
				+ descripcion + "]";
	}

	
    
}