package com.example.TCMFriend.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TCMFriend.Entity.PublicacionesFavoritos;


public interface PublicacionFavoritoRepo 
	extends JpaRepository <PublicacionesFavoritos,Integer>{
	
	PublicacionesFavoritos findByEmail(String email);
	
}
