package com.example.TCMFriend.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.TCMFriend.Dto.PublicacionFavoritoDTO;
import com.example.TCMFriend.Entity.PublicacionFavorito;
import com.example.TCMFriend.Repo.PublicacionFavoritoRepo;
import com.example.TCMFriend.Service.PublicacionFavoritoService;

@Service
@Transactional
public class PublicacionFavoritoIMPL implements PublicacionFavoritoService {
	
	@Autowired
	private PublicacionFavoritoRepo publicacionfavoritoRepo;
	
	@Override
	public List<PublicacionFavorito> obtenerPublicacion() {
		
		return publicacionfavoritoRepo.findAll();
	}
	@Override
	public String guardarPublicacionFavorito(PublicacionFavoritoDTO publicacionfavoritoDTO) {
	    PublicacionFavorito pubFav = new PublicacionFavorito(
	            publicacionfavoritoDTO.getPublicacionid(),
	            publicacionfavoritoDTO.getTitulo(),
	            publicacionfavoritoDTO.getCategoria(),
	            publicacionfavoritoDTO.getContenido(),
	            publicacionfavoritoDTO.getUrl(),
	            publicacionfavoritoDTO.getUsername(),
	            publicacionfavoritoDTO.getEmail(),
	            publicacionfavoritoDTO.getFecha_pub()
	    );
	    publicacionfavoritoRepo.save(pubFav);
	    return pubFav.getTitulo();
	}



	@Override
	public PublicacionFavorito findUsername(String username) {
		return publicacionfavoritoRepo.findByUsername(username);
	}

	@Override
	public String eliminarPublicacionfavorito(int id) {
		Optional<PublicacionFavorito> pubfav_id = publicacionfavoritoRepo.findById(id);
	    
	    if (pubfav_id.isPresent()) {
	    	publicacionfavoritoRepo.deleteById(id);
	        return "Publicacion eliminada con éxito";
	    } else {
	        return "No se encontró ninguna publicación con el ID especificado";
	    }
	}
}
