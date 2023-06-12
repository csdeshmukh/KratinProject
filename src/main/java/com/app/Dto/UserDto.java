package com.app.Dto;

import javax.persistence.OneToOne;

import com.app.Entity.Users;

public class UserDto {
 
	private Long id;
	private String email;
	private String password;
	private Users email1;
	public UserDto(Long id, String email, String password, Users email1) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.email1 = email1;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public Users getEmail1() {
		return email1;
	}
	public void setEmail1(Users email1) {
		this.email1 = email1;
	}
	
	
	
}
