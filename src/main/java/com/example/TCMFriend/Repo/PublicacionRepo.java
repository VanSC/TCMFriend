package com.example.TCMFriend.Repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.TCMFriend.Entity.Publicacion;

@EnableJpaRepositories
@Repository
public interface PublicacionRepo extends JpaRepository <Publicacion,Integer> {
	
	Publicacion findCategoria(String categoria);
	
	Publicacion findEmail(String email);

}
