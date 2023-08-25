package com.rashad.naukri_job.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rashad.naukri_job.dao.CompanyDao;
import com.rashad.naukri_job.entity.Company;

@Service
public class CompanyService {

	@Autowired
	CompanyDao dao;

	public String save(Company company) {
		return dao.save(company);
	}

}
