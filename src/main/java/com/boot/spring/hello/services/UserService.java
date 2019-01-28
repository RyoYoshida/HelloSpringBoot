package com.boot.spring.hello.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.spring.hello.models.User;
import com.boot.spring.hello.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(long id) {
		return repository.findById(id).orElseGet(null);
	}

	public void save(User user) {
		repository.save(user);
	}

	public User saveAndFlush(User user) {
		return repository.saveAndFlush(user);
	}
}
