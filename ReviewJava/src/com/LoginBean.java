package com;

public class LoginBean {

	private String userId;
	private String password;
	public LoginBean(String userId, String password) {
		
		this.userId = userId;
		this.password = password;
	}
	void login () {
		System.out.println("userId"+ userId);
		System.out.println("password"+ password);
	}
	
}
