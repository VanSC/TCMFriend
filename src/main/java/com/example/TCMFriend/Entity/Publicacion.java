package com.example.TCMFriend.Entity;
import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;


@Entity
@Table(name = "publicacion")
//@JsonInclude(JsonInclude.Include.NON_NULL)

public class Publicacion {
	@Id
    @Column(name="publicacion_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int publicacionid;
	
	@Column(name="publicacion_categoria", length = 200)
	private String categoria;
	
	@Column(name="publicacion_titulo", length = 200)
	private String titulo;
	
	@Column(name="publicacion_contenido", length = 400)
	private String contenido;
	
	@Column(name="publicacion_url", length = 400)
	private String url;
	
	@Column(name="email", length = 200)
	private String email;
	
	@Column(name = "publicacion_fecha", nullable = false, updatable = false)
	@CreationTimestamp
	private String fecha_pub;

	public Publicacion() {
		super();
	}

	public Publicacion(int publicacionid, String categoria, String titulo, String contenido, String url,
			String email, String fecha_pub) {
		super();
		this.publicacionid = publicacionid;
		this.categoria = categoria;
		this.titulo = titulo;
		this.contenido = contenido;
		this.url = url;
		this.email = email;
		this.fecha_pub = fecha_pub;
	}

	public int getPublicacionid() {
		return publicacionid;
	}

	public void setPublicacionid(int publicacionid) {
		this.publicacionid = publicacionid;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String username) {
		this.email = username;
	}

	public String getFecha_pub() {
		return fecha_pub;
	}

	public void setFecha_pub(String fecha_pub) {
		this.fecha_pub = fecha_pub;
	}

	@Override
	public String toString() {
		return "Publicacion [publicacionid=" + publicacionid + ", categoria=" + categoria + ", titulo=" + titulo
				+ ", contenido=" + contenido + ", url=" + url + ", email=" + email + ", fecha_pub=" + fecha_pub
				+ "]";
	}
	
	/**@ManyToOne(optional = false,fetch = FetchType.EAGER)
	@JoinColumn(name="usuario_id",nullable = false)
	private Usuario usuario;*/
	
}
