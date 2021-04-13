package com.mk.user.services;

import java.util.List;

import com.mk.user.entities.User;

public interface UserService {

	List<User> findAll();

	void save(User user);

	User findById(Integer id);

	void deleteById(Integer id);


}