package com.rashad.naukri_job.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rashad.naukri_job.entity.Company;
import com.rashad.naukri_job.repository.CompanyRepository;

@Component
public class CompanyDao {
	
	@Autowired
	CompanyRepository repo;
	
	
	public String save(Company company) {
		repo.save(company);
		return "Saved Successfully";
	}

}
