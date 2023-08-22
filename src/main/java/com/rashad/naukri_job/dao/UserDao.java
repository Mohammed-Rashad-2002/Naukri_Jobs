package com.rashad.naukri_job.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rashad.naukri_job.entity.User;
import com.rashad.naukri_job.repository.UserRepository;

@Component
public class UserDao {
	
	@Autowired
	UserRepository repo;
	
	public String saveUser(User user) {
		
		repo.save(user);
		return "Successfully saved";
		
	}
	
	
	public List<User> getUser(){
		return repo.findAll();
	}

}
