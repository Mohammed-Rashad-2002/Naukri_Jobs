package com.rashad.naukri_job.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rashad.naukri_job.dao.OpeningsDao;
import com.rashad.naukri_job.dao.UserDao;
import com.rashad.naukri_job.entity.Openings;
import com.rashad.naukri_job.entity.User;
import com.rashad.naukri_job.entity.UsersLogin;

@Service
public class UserService {
	
	@Autowired
	UserDao dao;
	@Autowired
	OpeningsDao openningsdao;
	
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
	
	
	public List<Openings> SearchJob(String data){
		List<Openings> result=new ArrayList();
		List<Openings> openings=openningsdao.getOpenings();
		
		for (Openings openings2 : openings) {
			if(openings2.getTitle().equals(data)) {
				result.add(openings2);
			}
		}
		
		return result;
		
	}

}
