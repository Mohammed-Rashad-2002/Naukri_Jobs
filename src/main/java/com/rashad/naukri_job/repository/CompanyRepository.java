package com.rashad.naukri_job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rashad.naukri_job.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
