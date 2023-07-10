package com.example.TCMFriend.Dto;

public class PublicacionesFavoritosDTO {
	
	private int publicacionid;
	private String titulo;
	private String categoria;
	private String contenido;
	private String url;
	private String username;
	private String fecha_pub;
	private String email;
	
	public PublicacionesFavoritosDTO() {
		super();
	}

	public PublicacionesFavoritosDTO(int publicacionid, String titulo, String categoria, String contenido, String url,
			String username, String fecha_pub, String email) {
		super();
		this.publicacionid = publicacionid;
		this.titulo = titulo;
		this.categoria = categoria;
		this.contenido = contenido;
		this.url = url;
		this.username = username;
		this.fecha_pub = fecha_pub;
		this.email = email;
	}

	public int getPublicacionid() {
		return publicacionid;
	}

	public void setPublicacionid(int publicacionid) {
		this.publicacionid = publicacionid;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFecha_pub() {
		return fecha_pub;
	}

	public void setFecha_pub(String fecha_pub) {
		this.fecha_pub = fecha_pub;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String logusername) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "PublicacionesFavoritosDTO [publicacionid=" + publicacionid + ", titulo=" + titulo + ", categoria="
				+ categoria + ", contenido=" + contenido + ", url=" + url + ", username=" + username + ", fecha_pub="
				+ fecha_pub + ", email=" + email + "]";
	}

}
