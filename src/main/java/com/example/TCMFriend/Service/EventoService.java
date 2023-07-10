package com.example.TCMFriend.Service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.TCMFriend.Dto.EventoDTO;
import com.example.TCMFriend.Entity.Eventos;

@Service
public interface EventoService {
	public List<Eventos> listarEventos();
	public String eliminarEvento(int id);
	public String addEvento(EventoDTO eventoDTO);

}
