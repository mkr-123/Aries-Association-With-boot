package com.Aries.associates.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApplicationUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long applicationUserId;
	private String applicationUserName;
	private String password;

	public Long getApplicationUserId() {
		return applicationUserId;
	}

	public void setApplicationUserId(Long applicationUserId) {
		this.applicationUserId = applicationUserId;
	}

	public String getApplicationUserName() {
		return applicationUserName;
	}

	public void setApplicationUserName(String applicationUserName) {
		this.applicationUserName = applicationUserName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
