package com.rashad.naukri_job.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rashad.naukri_job.entity.UserSkill;
import com.rashad.naukri_job.repository.UserSkillRepository;

@RestController
public class UserSkillController {
	
	@Autowired
	UserSkillRepository repo;
	
	@PostMapping("/userskill")
	public String sav(@RequestBody UserSkill user) {
		repo.save(user);
		return "successfully ";
	}

}
