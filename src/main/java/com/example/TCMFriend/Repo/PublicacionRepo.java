package com.example.TCMFriend.Repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.TCMFriend.Entity.Publicacion;

@EnableJpaRepositories
@Repository
public interface PublicacionRepo extends JpaRepository <Publicacion,Integer> {
	
	Publicacion findByCategoria(String categoria);
	
	Publicacion findByEmail(String email);

	void save(Optional<Publicacion> publi_username);

}
