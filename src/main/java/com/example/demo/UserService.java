package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;



@Service
public class UserService {
	@Autowired
	UserRespository repository;
	public void saveUser(Users user) {
		repository.save(user);
		System.out.println("user created " + user.getName());
	}
		@GetMapping
		public Iterable<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return repository.findAll();
		}
		public void deleteUser(int id) {
			// TODO Auto-generated method stub
			repository.deleteById(id);
		}
		
		
	}


