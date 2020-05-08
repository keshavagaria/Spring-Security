package com.mobileprogramming.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileprogramming.model.Client;



@Repository
public interface UserRepository extends JpaRepository<Client, Integer>{
	
	Optional<Client> findByUserName(String userName);
}
