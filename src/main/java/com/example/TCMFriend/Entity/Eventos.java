package com.example.TCMFriend.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "evento")
public class Eventos {
	
	@Id
    @Column(name="evento_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="evento_titulo", length = 200)
	private String titulo;
	
	@Column(name="evento_urlinfo", length = 200)
	private String url_info;
	
	@Column(name="evento_urlimg", length = 200)
	private String url_img;
	
	@Column(name="evento_fecha", length = 200)
	private String fecha_eve;

	public Eventos() {
		super();
	}

	public Eventos(int id, String titulo, String url_info, String url_img, String fecha_eve) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.url_info = url_info;
		this.url_img = url_img;
		this.fecha_eve = fecha_eve;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getUrl_info() {
		return url_info;
	}

	public void setUrl_info(String url_info) {
		this.url_info = url_info;
	}

	public String getUrl_img() {
		return url_img;
	}

	public void setUrl_img(String url_img) {
		this.url_img = url_img;
	}

	public String getFecha_eve() {
		return fecha_eve;
	}

	public void setFecha_eve(String fecha_eve) {
		this.fecha_eve = fecha_eve;
	}

	@Override
	public String toString() {
		return "Eventos [id=" + id + ", titulo=" + titulo + ", url_info=" + url_info + ", url_img=" + url_img
				+ ", fecha_eve=" + fecha_eve + "]";
	}
	
}
