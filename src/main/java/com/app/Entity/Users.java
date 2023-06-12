package com.app.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="userInf")
public class Users extends BaseEntity {

	@Column 
     private String name; 
	private String email;
	private String password;
	private String mobile;
	private String state;
	private String district;
	private String pin;
	
	public Users() {
		super();
	}

	public Users(String name, String email, String password, String mobile, String state, String district, String pin) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.state = state;
		this.district = district;
		this.pin = pin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
	
}
