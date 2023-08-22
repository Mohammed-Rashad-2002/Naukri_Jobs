package com.rashad.naukri_job.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Company {

	@Id
	private int company_id;
	private String name;
	private String industry;
	private String location;

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
