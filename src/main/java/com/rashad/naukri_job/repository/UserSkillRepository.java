package com.rashad.naukri_job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rashad.naukri_job.entity.UserSkill;

@Repository
public interface UserSkillRepository extends JpaRepository<UserSkill, Integer>{
	
	public UserSkill findByEmail(String email);

}
