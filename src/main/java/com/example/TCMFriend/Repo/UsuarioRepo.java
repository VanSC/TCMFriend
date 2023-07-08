package com.example.TCMFriend.Repo;

import com.example.TCMFriend.Entity.Usuario;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository

public interface UsuarioRepo extends JpaRepository <Usuario, Integer> {

	Optional<Usuario> findOneByEmailAndPassword(String email, String passsword);
	
	Usuario findByEmail(String email);
	//Usuario findById(int id);
}