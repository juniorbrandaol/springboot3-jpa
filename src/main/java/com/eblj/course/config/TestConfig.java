package com.eblj.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.eblj.course.entities.User;
import com.eblj.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Edilson Bfandão", "edilson@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Keylla Brandão", "keylla@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Gabriel Brandão", "gabriel@gmail.com", "977777777", "123456");
		User u4 = new User(null, "Rute Brandão", "rute@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2,u3,u4));
		
	} 

}
