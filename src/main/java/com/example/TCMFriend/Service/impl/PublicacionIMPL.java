package com.example.TCMFriend.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.TCMFriend.Dto.PublicacionDTO;
import com.example.TCMFriend.Entity.Publicacion;
import com.example.TCMFriend.Repo.PublicacionRepo;
import com.example.TCMFriend.Repo.UsuarioRepo;
import com.example.TCMFriend.Service.PublicacionService;
import com.example.TCMFriend.Service.UsuarioService;

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
	public String addPublicacion(PublicacionDTO publicacionDTO) {
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
	public String updatePublicacion(String email, PublicacionDTO publicacionDTO) {
		Publicacion publi_username = publicacionRepo.findByEmail(email);
			publi_username.setTitulo(publicacionDTO.getTitulo());
			publi_username.setCategoria(publicacionDTO.getCategoria());
			publi_username.setContenido(publicacionDTO.getContenido());
			publi_username.setUrl(publicacionDTO.getUrl());
			publi_username.setEmail(publicacionDTO.getEmail());
			publi_username.setFecha_pub(publicacionDTO.getFecha_pub());
		publicacionRepo.save(publi_username);

		return publi_username.getTitulo();
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
