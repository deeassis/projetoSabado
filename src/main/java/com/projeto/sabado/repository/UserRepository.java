package com.projeto.sabado.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.sabado.model.User;

// comunicacao com o banco de dados

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
	public Optional<User> findByNome(String nome);
	
}
