package com.rashad.naukri_job.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rashad.naukri_job.dao.UserDao;
import com.rashad.naukri_job.entity.User;
import com.rashad.naukri_job.entity.UsersLogin;

@Service
public class UserService {
	
	@Autowired
	UserDao dao;
	
	public String userSave(User user) {
		if(user!=null) {
			return dao.saveUser(user);
		}
		
		return null;
		
	}
	
	
	public Boolean login(UsersLogin login) {
		List<User> user=dao.getUser();
		
		for (User users : user) {
			
			if(users.getEmail().equals(login.getEmail()) && users.getPassword().equals(login.getPassword())) {
				return true;
			}
			
		}
		
		return false;
	}

}
