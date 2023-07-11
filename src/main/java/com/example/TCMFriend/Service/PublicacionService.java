package com.example.TCMFriend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.TCMFriend.Dto.PublicacionDTO;
import com.example.TCMFriend.Entity.Publicacion;

@Service
public interface PublicacionService {

	public List<Publicacion> obtenerPublicacion();

    String guardarPublicacion(PublicacionDTO publicacionDTO);
    
    //public Publicacion encontrarPublicacion(int id);
    
    public List<Publicacion> findEmail(String email);
    
    public List<Publicacion> findCategoria(String categoria);
    
    public Optional<Publicacion> findId(int id);
    
    public String updatePublicacion(int id, PublicacionDTO publicacionDTO);
	
	//String editarPublicacion(int id, PublicacionDTO publicacionDTO);
    public String eliminarPublicacion(int id);
}
