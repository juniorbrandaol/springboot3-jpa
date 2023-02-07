package com.eblj.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eblj.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
