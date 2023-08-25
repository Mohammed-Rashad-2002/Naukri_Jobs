package com.rashad.naukri_job.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rashad.naukri_job.entity.Company;
import com.rashad.naukri_job.service.CompanyService;

@RestController
public class CompanyController {

	@Autowired
	CompanyService service;

	@PostMapping("/company")
	public String save(@RequestBody Company company) {
		return service.save(company);
	}

}
