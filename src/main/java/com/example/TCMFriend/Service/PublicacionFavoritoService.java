package com.example.TCMFriend.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.TCMFriend.Dto.PublicacionFavoritoDTO;
import com.example.TCMFriend.Entity.PublicacionFavorito;

@Service
public interface PublicacionFavoritoService {
	
	public List<PublicacionFavorito> obtenerPublicacion();

    String guardarPublicacionFavorito(PublicacionFavoritoDTO publicacionfavoritoDTO);
 
    public PublicacionFavorito findUsername(String username);
    
    public String eliminarPublicacionfavorito(int id);
}
