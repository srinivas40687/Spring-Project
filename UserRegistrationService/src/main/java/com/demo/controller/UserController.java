package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.repository.UserRepository;
import com.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(value="/user",  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> getAll() {
		List<User> list = new ArrayList<>();
		Iterable<User> users = userService.getAll();

		users.forEach(list::add);
		return list;
	}
	
	@PostMapping(value="/user")
	public User postUser(@RequestBody User user) {

		userService.createUser(new User(user.getFirstName(), user.getLastName()));
		return user;
	}

	@GetMapping(value="/findbylastname/{lastName}",  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> findByLastName(@PathVariable String lastName) {

		List<User> users = userService.findByLastName(lastName);
		return users;
	}
	
	@DeleteMapping(value="/user/{id}")
	public void deleteUser(@PathVariable long id){
		
		userService.deleteUser(id);
	}
}
