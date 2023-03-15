package com.carlosdiegoc.purchasing.system.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlosdiegoc.purchasing.system.entities.User;
import com.carlosdiegoc.purchasing.system.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> users = userRepository.findById(id);
		return users.get();
	}
}
