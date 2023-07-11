package com.example.TCMFriend.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TCMFriend.Entity.PublicacionFavorito;


public interface PublicacionFavoritoRepo extends JpaRepository <PublicacionFavorito,Integer> {
	PublicacionFavorito findByUsername(String username);
}
