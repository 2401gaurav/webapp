package com.retro;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.retro.entity.User;
import com.retro.repository.UserRepository;

@SpringBootApplication
public class RetroApplication {
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(RetroApplication.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){
		User user= new User();
		//user.setSkills(Arrays.asList(new Skill("java"), new Skill("js")));
		user= userRepository.save(user);
	}
}
