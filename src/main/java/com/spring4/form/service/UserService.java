package com.spring4.form.service;

import java.util.List;

import com.spring4.form.model.User;

public interface UserService {

	User findById(Integer id);
	
	List<User> findAll();

	void saveOrUpdate(User user);
	
	void delete(int id);
	
}