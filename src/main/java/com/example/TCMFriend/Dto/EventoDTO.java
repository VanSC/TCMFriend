package com.example.TCMFriend.Dto;

public class EventoDTO {
	
	private int eventoid;
	private String titulo;
	private String url_info;
	private String url_img;
	private String fecha;
	
	public EventoDTO() {
		super();
	}

	public EventoDTO(int eventoid, String titulo, String url_info, String url_img, String fecha) {
		super();
		this.eventoid = eventoid;
		this.titulo = titulo;
		this.url_info = url_info;
		this.url_img = url_img;
		this.fecha = fecha;
	}

	public int getEventoid() {
		return eventoid;
	}

	public void setEventoid(int eventoid) {
		this.eventoid = eventoid;
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "eventoDTO [eventoid=" + eventoid + ", titulo=" + titulo + ", url_info=" + url_info + ", url_img="
				+ url_img + ", fecha=" + fecha + "]";
	}

}
