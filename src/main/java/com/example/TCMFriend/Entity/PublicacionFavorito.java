package com.example.TCMFriend.Entity;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "publicacion_favorito")
public class PublicacionFavorito {
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
	
	@Column(name="publicacion_email", length = 200)
	private String email;
	
	@Column(name = "publicacion_fecha", nullable = false, updatable = false)
	@CreationTimestamp
	private String fecha_pub;
	
	@Column(name="publicacion_username", length = 200)
	private String username;

	public PublicacionFavorito() {
		super();
	}

	public PublicacionFavorito(int publicacionid, String titulo, String categoria, String contenido, String url,
			String email, String fecha_pub, String username) {
		super();
		this.publicacionid = publicacionid;
		this.categoria = categoria;
		this.titulo = titulo;
		this.contenido = contenido;
		this.url = url;
		this.email = email;
		this.fecha_pub = fecha_pub;
		this.username = username;
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

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFecha_pub() {
		return fecha_pub;
	}

	public void setFecha_pub(String fecha_pub) {
		this.fecha_pub = fecha_pub;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "PublicacionFavorito [publicacionid=" + publicacionid + ", categoria=" + categoria + ", titulo=" + titulo
				+ ", contenido=" + contenido + ", url=" + url + ", email=" + email + ", fecha_pub=" + fecha_pub
				+ ", username=" + username + "]";
	}
}
