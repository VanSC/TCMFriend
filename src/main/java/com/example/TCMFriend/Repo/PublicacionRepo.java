package com.example.TCMFriend.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.TCMFriend.Entity.Publicacion;

@EnableJpaRepositories
@Repository
public interface PublicacionRepo extends JpaRepository <Publicacion,Integer> {
	

}
