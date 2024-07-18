package com.aadharesign.utils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginRequest {

	@JsonProperty("UserName")
	private String userName;

	@JsonProperty("Password")
	private String password;

	// Default constructor (needed for Jackson)
	public LoginRequest() {
	}

	// Constructor with parameters
	public LoginRequest(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	// Getters and setters
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginRequest{" + "userName='" + userName + '\'' + ", password='" + password + '\'' + '}';
	}
}
