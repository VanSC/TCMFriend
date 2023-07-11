package com.example.TCMFriend.Repo;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.TCMFriend.Entity.Publicacion;
import com.example.TCMFriend.Entity.PublicacionFavorito;

@EnableJpaRepositories
@Repository
public interface PublicacionRepo extends JpaRepository <Publicacion,Integer> {
	List<Publicacion> findByCategoria(String categoria);
	
	List<Publicacion> findByEmail(String email);

	void save(Optional<Publicacion> publi_username);

}
