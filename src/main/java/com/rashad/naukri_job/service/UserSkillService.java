package com.rashad.naukri_job.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rashad.naukri_job.dao.OpeningsDao;
import com.rashad.naukri_job.dao.UserSkillDao;
import com.rashad.naukri_job.entity.Openings;
import com.rashad.naukri_job.entity.UserSkill;

@Service
public class UserSkillService {

	@Autowired
	UserSkillDao dao;

	@Autowired
	OpeningsDao openingsDao;

	public List<Openings> recomendedjobs(String email) {
		UserSkill user = dao.getUser(email);
		
		System.out.println(user.getEmail());
		List<Openings> openings = openingsDao.getOpenings();
		List<String> keySkill = user.getKeySkill();
		System.out.println(keySkill);
		List<Openings> result = new ArrayList();

		for (Openings openings2 : openings) {

			for (String skill : keySkill) {
				if (openings2.getSkill().equalsIgnoreCase(skill)) {
					result.add(openings2);
				}
			}

		}
		
		return result;

	}

}
