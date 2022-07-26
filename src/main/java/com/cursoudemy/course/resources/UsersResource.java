package com.cursoudemy.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoudemy.course.entities.Users;

@RestController
@RequestMapping(value = "/users")
public class UsersResource {
	
	@GetMapping
	public ResponseEntity<Users> findAll(){
		Users u = new Users(1L, "Maria", "maria@gmail.com", "99999", "12346");
		return ResponseEntity.ok().body(u);
				
	}
}
