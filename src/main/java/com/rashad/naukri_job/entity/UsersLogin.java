package com.rashad.naukri_job.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Id;

@Component
public class UsersLogin {

	@Id
	private String email;
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
