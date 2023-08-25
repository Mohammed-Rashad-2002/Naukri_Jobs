package com.rashad.naukri_job.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rashad.naukri_job.entity.UserSkill;
import com.rashad.naukri_job.repository.UserSkillRepository;

@Component
public class UserSkillDao {
	
	@Autowired
	UserSkillRepository repo;
	
	
	public List<UserSkill> getAllData(){
		return repo.findAll();
	}
	
	public UserSkill getUser(String email) {
		return repo.findByEmail(email);
	}

}
