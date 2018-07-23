package com.demo.service;

import java.util.List;

import com.demo.model.User;

public interface UserService {

	public List<User> getAll();

	public User createUser(User user);

	public List<User> findByLastName(String lastName);

	public void deleteUser(long id);

}
