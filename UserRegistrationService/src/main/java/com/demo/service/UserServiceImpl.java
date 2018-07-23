package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.User;
import com.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository repository;
	

	@Override
	public List<User> getAll() {
		
		List<User> list = new ArrayList<>();
		Iterable<User> customers = repository.findAll();

		customers.forEach(list::add);
		return list;
	}

	@Override
	public User createUser(User user) {
		repository.save(new User(user.getFirstName(), user.getLastName()));
		return user;
	}

	@Override
	public List<User> findByLastName(String lastName) {
		
		List<User> users = repository.findByLastName(lastName);
		return users;
		
	}

	@Override
	public void deleteUser(long id) {
		repository.delete(id);
		
	}

}
