package com.example.TCMFriend.UsuarioController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TCMFriend.Dto.PublicacionDTO;
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

}
