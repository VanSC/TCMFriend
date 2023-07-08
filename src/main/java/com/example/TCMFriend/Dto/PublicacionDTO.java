package com.example.TCMFriend.Dto;

import com.example.TCMFriend.Entity.Usuario;

public class PublicacionDTO {
	
	private int publicacionid;
	private String titulo;
	private String contenido;
	private String url;
	private String fecha_pub;
	private Usuario usuario;
	
	public PublicacionDTO() {
		super();
	}

	public PublicacionDTO(int publicacionid, String titulo, String contenido,String url, String fecha_pub, Usuario usuario) {
		super();
		this.publicacionid = publicacionid;
		this.titulo = titulo;
		this.contenido = contenido;
		this.url = url;
		this.fecha_pub = fecha_pub;
		this.usuario = usuario;
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

	public String getFecha_pub() {
		return fecha_pub;
	}

	public void setFecha_pub(String fecha_pub) {
		this.fecha_pub = fecha_pub;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "PublicacionDTO [publicacionid=" + publicacionid + ", titulo=" + titulo + ", contenido=" + contenido
				+ ", url=" + url + ", fecha_pub=" + fecha_pub + ", usuario=" + usuario + "]";
	}
}
