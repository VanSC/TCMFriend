package com.example.TCMFriend.UsuarioController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TCMFriend.Dto.PublicacionDTO;
import com.example.TCMFriend.Dto.UsuarioDTO;
import com.example.TCMFriend.Entity.Publicacion;
import com.example.TCMFriend.Service.PublicacionService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/publicacion")

public class PublicacionController {
	
	@Autowired
	public PublicacionService publicacionService;
	
	@GetMapping("")
	public List<Publicacion> obtenerPublicacion(){
		return publicacionService.obtenerPublicacion();
	}
	
	@PostMapping(path = "/save")
	public String guardarPublicacion(@RequestBody PublicacionDTO publicacionDTO) {
		String pub = publicacionService.addPublicacion(publicacionDTO);
		return pub;
	}
	
	@PutMapping(path = "/actualizar/{id}")
    public String actualizarPublicacion(@PathVariable int id, @RequestBody PublicacionDTO publicacionDTO){
		
		String publicacion = publicacionService.updatePublicacion(id, publicacionDTO);
		
		return publicacion;
    }
	
	@GetMapping("/{categoria}")
	public ResponseEntity<Publicacion> findPublicacion(@PathVariable String categoria){
		Publicacion publi_user = publicacionService.findCategoria(categoria);
		return ResponseEntity.ok(publi_user);
	}
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminarPublicacion(@PathVariable int id) {
	    String resultado = publicacionService.eliminarPublicacion(id);
	    return ResponseEntity.ok(resultado);
	}


}
