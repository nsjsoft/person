package com.nsjsoft.person.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nsjsoft.person.domain.UserRepository;

@RestController
public class UserController {
	
	private UserRepository userRepository;	
	
	public UserController(UserRepository userRepository) {		
		this.userRepository = userRepository;
	}

	@GetMapping("/user")
	public void findAll() {	
		
		System.out.println("findAll()");
	}
	
	@GetMapping("/user/{id}")
	public void findById(@PathVariable int id) {
		System.out.println("findById()");
	}	
	
	@PostMapping("/user")
	public void save(String username, String password, String phone) {
		System.out.println("save()");
		
	}
	
	@PutMapping("/user/{id}")
	public void update(@PathVariable int id) {
		System.out.println("update()");
	}
	
	@DeleteMapping("/user/{id}")
	public void delete(@PathVariable int id) {
		System.out.println("delete()");
		
	}
	
	
}
