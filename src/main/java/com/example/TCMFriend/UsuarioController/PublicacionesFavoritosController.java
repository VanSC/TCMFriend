package com.example.TCMFriend.UsuarioController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TCMFriend.Dto.PublicacionesFavoritosDTO;
import com.example.TCMFriend.Entity.Publicacion;
import com.example.TCMFriend.Entity.PublicacionesFavoritos;
import com.example.TCMFriend.Service.PublicacionFavoritoService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/publicacionfavoritos")
public class PublicacionesFavoritosController {
	
	@Autowired
	public PublicacionFavoritoService publicacionesfavoritosService;
	
	@GetMapping("")
	public List<PublicacionesFavoritos> listarPublicacionFav(){
		return publicacionesfavoritosService.obtenerPublicacion();
	}
	
	@PostMapping(path = "/save")
	public String guardarPublicacionFav(@RequestBody PublicacionesFavoritosDTO publicacionesfavoritosDTO) {
		String pubfav = publicacionesfavoritosService.addFavPub(publicacionesfavoritosDTO);
		return pubfav;
	}
	@GetMapping("/{username}")
	public ResponseEntity<PublicacionesFavoritos> findPublicacion(@PathVariable String username){
		PublicacionesFavoritos publi_fav = publicacionesfavoritosService.findUsername(username);
		return ResponseEntity.ok(publi_fav);
	}
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminarPublicacionFav(@PathVariable int id) {
	    String resultado = publicacionesfavoritosService.eliminarPublicacion(id);
	    return ResponseEntity.ok(resultado);
	}
}
