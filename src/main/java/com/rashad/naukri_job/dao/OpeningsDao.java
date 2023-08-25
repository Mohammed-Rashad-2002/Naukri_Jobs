package com.rashad.naukri_job.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rashad.naukri_job.entity.Openings;
import com.rashad.naukri_job.repository.OpeningsRepository;

@Component
public class OpeningsDao {
	
	@Autowired
	OpeningsRepository repo;
	
	
	public String save(Openings openings) {
		repo.save(openings);
		return "Saved successfully";
	}
	
	
	public List<Openings> getOpenings(){
		return repo.findAll();
	}

}
