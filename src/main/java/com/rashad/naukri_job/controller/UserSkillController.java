package com.rashad.naukri_job.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rashad.naukri_job.entity.Openings;
import com.rashad.naukri_job.entity.UserSkill;
import com.rashad.naukri_job.repository.UserSkillRepository;
import com.rashad.naukri_job.service.UserSkillService;

@RestController
public class UserSkillController {

	@Autowired
	UserSkillRepository repo;

	@Autowired
	UserSkillService service;

	@PostMapping("/userskill")
	public String sav(@RequestBody UserSkill user) {
		repo.save(user);
		return "successfully ";
	}

	@GetMapping("/recommendedjobs/{email}")
	public List<Openings> recommendedjobs(@PathVariable String email) {
		return service.recomendedjobs(email);
	}

}
