package com.example.TCMFriend.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.TCMFriend.Dto.PublicacionDTO;
import com.example.TCMFriend.Entity.Publicacion;
import com.example.TCMFriend.Repo.PublicacionRepo;
import com.example.TCMFriend.Service.PublicacionService;

@Service
@Transactional
public class PublicacionIMPL implements PublicacionService {
	
	@Autowired
    private PublicacionRepo publicacionRepo;

	@Override
	public List<Publicacion> obtenerPublicacion() {
		return publicacionRepo.findAll();
	}

	@Override
	public String guardarPublicacion(PublicacionDTO publicacionDTO) {
		Publicacion publicacion = new Publicacion(
				publicacionDTO.getPublicacionid(),
				publicacionDTO.getTitulo(),
				publicacionDTO.getCategoria(),
				publicacionDTO.getContenido(),
				publicacionDTO.getUrl(),
				publicacionDTO.getEmail(),
				publicacionDTO.getFecha_pub());
		publicacionRepo.save(publicacion);
		return publicacion.getTitulo();
	}

	/**@Override
	public Publicacion encontrarPublicacion(int id) {
		return null;
	}

	@Override
	public String editarPublicacion(int id, PublicacionDTO publicacionDTO) {
		return null;
	}*/

	@Override
	public Publicacion findEmail(String email) {
		return publicacionRepo.findByEmail(email);
	}

	@Override
	public Publicacion findCategoria(String categoria) {
		return publicacionRepo.findByCategoria(categoria);
	}

	@Override
	public String updatePublicacion(int id, PublicacionDTO publicacionDTO) {
	    Optional<Publicacion> optionalPublicacion = publicacionRepo.findById(id);
	    if (optionalPublicacion.isPresent()) {
	        Publicacion publicacion = optionalPublicacion.get();
	        publicacion.setTitulo(publicacionDTO.getTitulo());
	        publicacion.setCategoria(publicacionDTO.getCategoria());
	        publicacion.setContenido(publicacionDTO.getContenido());
	        publicacion.setUrl(publicacionDTO.getUrl());
	        publicacion.setEmail(publicacionDTO.getEmail());
	        publicacion.setFecha_pub(publicacionDTO.getFecha_pub());
	        publicacionRepo.save(publicacion);
	        return publicacion.getTitulo();
	    } else {
	        return "No se encontró ninguna publicación";
	    }
	}

	@Override
	public String eliminarPublicacion(int id){
		    Optional<Publicacion> publicacionOptional = publicacionRepo.findById(id);
		    
		    if (publicacionOptional.isPresent()) {
		        publicacionRepo.deleteById(id);
		        return "Publicación eliminada con éxito";
		    } else {
		        return "No se encontró ninguna publicación con el ID especificado";
		    }
		}
}
