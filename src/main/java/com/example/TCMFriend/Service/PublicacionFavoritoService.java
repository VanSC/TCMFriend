package com.example.TCMFriend.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.TCMFriend.Dto.PublicacionesFavoritosDTO;
import com.example.TCMFriend.Dto.UsuarioDTO;
import com.example.TCMFriend.Entity.PublicacionesFavoritos;

@Service
public interface PublicacionFavoritoService {
	
	public String addFavPub(PublicacionesFavoritosDTO publicacionesfavoritosDTO);
	public List<PublicacionesFavoritos> obtenerPublicacion();
	public PublicacionesFavoritos findUsername(String username);
	public String eliminarPublicacion(int id);
	//public String updateUsuario(String email, UsuarioDTO usuarioDTO);
}
