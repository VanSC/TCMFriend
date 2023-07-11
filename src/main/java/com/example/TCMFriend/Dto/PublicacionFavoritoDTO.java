package com.example.TCMFriend.Dto;

public class PublicacionFavoritoDTO {
	
	private int publicacionid;
	private String titulo;
	private String categoria;
	private String contenido;
	private String url;
	private String email;
	private String fecha_pub;
	private String username;
	
	public PublicacionFavoritoDTO() {
		super();
	}

	public PublicacionFavoritoDTO(int publicacionid, String titulo, String categoria, String contenido, String url,
			String email, String fecha_pub, String username) {
		super();
		this.publicacionid = publicacionid;
		this.titulo = titulo;
		this.categoria = categoria;
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
		return "PublicacionFavoritoDTO [publicacionid=" + publicacionid + ", titulo=" + titulo + ", categoria="
				+ categoria + ", contenido=" + contenido + ", url=" + url + ", email=" + email + ", fecha_pub="
				+ fecha_pub + ", username=" + username + "]";
	}
}
