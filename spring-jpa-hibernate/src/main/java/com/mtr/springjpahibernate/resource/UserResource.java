package com.mtr.springjpahibernate.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtr.springjpahibernate.model.Users;
import com.mtr.springjpahibernate.repository.UserRepository;

@RestController
@RequestMapping("/rest/users")
public class UserResource {
	
	@Autowired
	UserRepository userRepository;
	
	
	@GetMapping
	public List<Users> getAll() {
		
		return userRepository.findAll();
		
	}

}
