package com.example.TCMFriend.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.TCMFriend.Dto.PublicacionDTO;
import com.example.TCMFriend.Entity.Publicacion;

@Service
public interface PublicacionService {

	public List<Publicacion> obtenerPublicacion();

    String addPublicacion(PublicacionDTO publicacionDTO);
    
    //public Publicacion encontrarPublicacion(int id);
    
    public Publicacion findEmail(String email);
    
    public Publicacion findCategoria(String categoria);
    
    public String updatePublicacion(String email, PublicacionDTO publicacionDTO);
	
	//String editarPublicacion(int id, PublicacionDTO publicacionDTO);
    public String eliminarPublicacion(int id);
}
