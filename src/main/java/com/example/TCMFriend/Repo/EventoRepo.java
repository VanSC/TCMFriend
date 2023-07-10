package com.example.TCMFriend.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.TCMFriend.Entity.Eventos;

@EnableJpaRepositories
@Repository
public interface EventoRepo extends JpaRepository <Eventos,Integer> {

}
