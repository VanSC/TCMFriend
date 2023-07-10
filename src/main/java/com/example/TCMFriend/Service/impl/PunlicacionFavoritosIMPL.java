package com.example.TCMFriend.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.TCMFriend.Dto.PublicacionesFavoritosDTO;
import com.example.TCMFriend.Entity.PublicacionesFavoritos;
import com.example.TCMFriend.Repo.PublicacionFavoritoRepo;
import com.example.TCMFriend.Service.PublicacionFavoritoService;

public class PunlicacionFavoritosIMPL implements PublicacionFavoritoService{
	
	@Autowired
	public PublicacionFavoritoRepo publicacionesfavoritosRepo;
	
	@Override
	public String addFavPub(PublicacionesFavoritosDTO publicacionesfavoritosDTO) {
		PublicacionesFavoritos publicacionFav = new PublicacionesFavoritos();
			publicacionesfavoritosDTO.getPublicacionid();
			publicacionesfavoritosDTO.getTitulo();
			publicacionesfavoritosDTO.getContenido();
			publicacionesfavoritosDTO.getUrl();
			publicacionesfavoritosDTO.getUsername();
			publicacionesfavoritosDTO.getFecha_pub();
			publicacionesfavoritosDTO.getLogusername();
		publicacionesfavoritosRepo.save(publicacionFav);
		return publicacionFav.getTitulo();
	}

	@Override
	public List<PublicacionesFavoritos> obtenerPublicacion() {
		return publicacionesfavoritosRepo.findAll();
	}

	@Override
	public PublicacionesFavoritos findUsername(String username) {
		return publicacionesfavoritosRepo.findUser(username);
	}

	@Override
	public String eliminarPublicacion(int id) {
	    Optional<PublicacionesFavoritos> publicacionOptional = publicacionesfavoritosRepo.findById(id);
	    
	    if (publicacionOptional.isPresent()) {
	        publicacionesfavoritosRepo.deleteById(id);
	        return "Publicación eliminada con éxito";
	    } else {
	        return "No se encontró ninguna publicación con el ID especificado";
	    }
	}

}
