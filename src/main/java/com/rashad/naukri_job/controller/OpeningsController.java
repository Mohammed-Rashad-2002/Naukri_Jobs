package com.rashad.naukri_job.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rashad.naukri_job.entity.Openings;
import com.rashad.naukri_job.service.OpeningsService;

@RestController
public class OpeningsController {
	
	@Autowired
	OpeningsService service;
	
	@PostMapping("/openings")
	public String save(@RequestBody Openings openings) {
		return service.save(openings);
	}

}
