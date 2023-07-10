package com.example.TCMFriend.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.TCMFriend.Dto.EventoDTO;
import com.example.TCMFriend.Entity.Eventos;
import com.example.TCMFriend.Repo.EventoRepo;
import com.example.TCMFriend.Service.EventoService;

@Service
@Transactional
public class EventoIMPL implements EventoService {
	
	@Autowired
	private EventoRepo eventoRepo;
	
	@Override
	public List<Eventos> listarEventos() {
		return eventoRepo.findAll();
	}
	
	//@Override
	public String eliminarEvento(int id) {
		Optional<Eventos> eventoId = eventoRepo.findById(id);
	    
	    if (eventoId.isPresent()) {
	    	eventoRepo.deleteById(id);
	        return "Evento eliminado con éxito";
	    } else {
	        return "No se encontró ninguna publicación con el ID especificado";
	    }
	}

	@Override
	public String addEvento(EventoDTO eventoDTO) {
		Eventos evento = new Eventos(
				eventoDTO.getEventoid(),
				eventoDTO.getTitulo(),
				eventoDTO.getUrl_info(),
				eventoDTO.getUrl_img(),
				eventoDTO.getFecha()
				);
		eventoRepo.save(evento);
		return evento.getTitulo();
	}
}
