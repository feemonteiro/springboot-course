package com.cursoudemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoudemy.course.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{
	
	
	
}
