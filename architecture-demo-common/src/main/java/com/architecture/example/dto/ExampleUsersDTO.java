package com.architecture.example.dto;

import com.ea.core.base.dto.BaseDTO;

public class ExampleUsersDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3481307602572783841L;
	private String userId;
	private String username;
    private String password;
    private String passwordSalt;
    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordSalt() {
		return passwordSalt;
	}
	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}


