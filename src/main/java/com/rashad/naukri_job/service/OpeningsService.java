package com.rashad.naukri_job.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rashad.naukri_job.dao.OpeningsDao;
import com.rashad.naukri_job.entity.Openings;

@Service
public class OpeningsService {
	
	@Autowired
	OpeningsDao dao;
	
	public String save(Openings openings) {
		return dao.save(openings);
	}
	

}
