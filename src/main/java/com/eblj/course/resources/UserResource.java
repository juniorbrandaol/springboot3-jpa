package com.eblj.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eblj.course.entities.User;

@RestController
@RequestMapping(value="/users/findAll")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Maria","maria@gmail.com","83998184302","123456");
		return ResponseEntity.ok().body(u);
	}
	
		
}
