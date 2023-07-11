package com.example.TCMFriend.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TCMFriend.Entity.PublicacionFavorito;


public interface PublicacionFavoritoRepo extends JpaRepository <PublicacionFavorito,Integer> {
	
	List<PublicacionFavorito> findByUsername(String username);
}
