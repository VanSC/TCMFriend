package com.example.TCMFriend.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
				publicacionDTO.getContenido(),
				publicacionDTO.getUrl(),
				publicacionDTO.getFecha_pub());
		publicacionRepo.save(publicacion);
		return publicacion.getTitulo();
	}

	@Override
	public Publicacion encontrarPublicacion(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String editarPublicacion(int id, PublicacionDTO publicacionDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
