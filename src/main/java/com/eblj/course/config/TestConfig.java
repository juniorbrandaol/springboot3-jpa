package com.eblj.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.eblj.course.entities.Order;
import com.eblj.course.entities.User;
import com.eblj.course.repositories.OrderRepository;
import com.eblj.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orederRepository; 

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Keylla Brandão", "keylla@gmail.com", "977777777", "123456");
		User u2 = new User(null, "Gabriel Brandão", "gabriel@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Rute Brandão", "rute@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1);
		
		userRepository.saveAll(Arrays.asList(u1,u2,u3));
		orederRepository.saveAll(Arrays.asList(o1,o2,o3));
		
	} 

}
