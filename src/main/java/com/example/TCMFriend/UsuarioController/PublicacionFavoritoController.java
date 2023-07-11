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

import com.example.TCMFriend.Dto.PublicacionFavoritoDTO;
import com.example.TCMFriend.Entity.PublicacionFavorito;
import com.example.TCMFriend.Service.PublicacionFavoritoService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/publicacionfavorito")
public class PublicacionFavoritoController {
	
	@Autowired
	private PublicacionFavoritoService pubfavoritoService;
	
	@GetMapping("")
	public List<PublicacionFavorito> obtenerPublicacion(){
		return pubfavoritoService.obtenerPublicacion();
	}
	
	@PostMapping(path = "/save")
	public String saveEvento(@RequestBody PublicacionFavoritoDTO publicacionfavoritoDTO){
	    String pubfav = pubfavoritoService.guardarPublicacionFavorito(publicacionfavoritoDTO);
	    return pubfav;
	}
	
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminarPublicacionFavorito(@PathVariable int id) {
	    String resultado = pubfavoritoService.eliminarPublicacionfavorito(id);
	    return ResponseEntity.ok(resultado);
	}
}
