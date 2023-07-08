package com.example.TCMFriend.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.TCMFriend.Dto.PublicacionDTO;
import com.example.TCMFriend.Entity.Publicacion;

@Service
public interface PublicacionService {

	public List<Publicacion> obtenerPublicacion();

    String addPublicacion(PublicacionDTO publicacionDTO);
    
    public Publicacion encontrarPublicacion(int id);
	
	String editarPublicacion(int id, PublicacionDTO publicacionDTO);
}
