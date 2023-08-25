package com.rashad.naukri_job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rashad.naukri_job.entity.Openings;

@Repository
public interface OpeningsRepository extends JpaRepository<Openings, Integer>{

}
