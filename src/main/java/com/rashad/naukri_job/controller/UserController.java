package com.rashad.naukri_job.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rashad.naukri_job.entity.Openings;
import com.rashad.naukri_job.entity.User;
import com.rashad.naukri_job.entity.UsersLogin;
import com.rashad.naukri_job.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;

	@PostMapping("/user")
	public String saveUser(@RequestBody User user) {
		return service.userSave(user);

	}
	
	
	@GetMapping("/user")
	public String login(@RequestBody UsersLogin login) {
		boolean isAuthenticated=service.login(login);
		
		if(isAuthenticated) {
			return "Login successfull";
		}else {
			return "User not found";
		}
	}
	
	
	@GetMapping("/searchjob/{data}")
	public List<Openings> searchJob(@PathVariable String data) {
		
		
		System.out.println("Api working");
		
		return service.SearchJob(data);
		
	}

}
