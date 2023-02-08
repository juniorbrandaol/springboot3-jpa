package com.eblj.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eblj.course.entities.User;
import com.eblj.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;

	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj =  repository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id,User obj) {
		User entitie = repository.getReferenceById(id);
		updateData(entitie,obj);
		return repository.save(entitie);
	}

	private void updateData(User entitie, User obj) {
		entitie.setName(obj.getName());
		entitie.setEmail(obj.getEmail());
		entitie.setPhone(obj.getPhone());
	}
	
}
