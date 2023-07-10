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

import com.example.TCMFriend.Dto.EventoDTO;
import com.example.TCMFriend.Dto.UsuarioDTO;
import com.example.TCMFriend.Entity.Eventos;
import com.example.TCMFriend.Service.EventoService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/evento")
public class EventoController {
	
	@Autowired
    private EventoService eventoService;
	
	@GetMapping("")
	public List<Eventos> obtenerPublicacion(){
		return eventoService.listarEventos();
	}
	
	@PostMapping(path = "/save")
	public String saveEvento(@RequestBody EventoDTO eventoDTO){
	    String evento = eventoService.addEvento(eventoDTO);
	    return evento;
	}
	
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminarEvento(@PathVariable int id) {
	    String resultado = eventoService.eliminarEvento(id);
	    return ResponseEntity.ok(resultado);
	}
}
