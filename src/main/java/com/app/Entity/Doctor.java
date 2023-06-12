package com.app.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor extends BaseEntity {
	
	private String name;
	private String moblie;
	private String email;
	private String password;
	private String speciality;
	private String description;
	private String state;
	private String district;
    private String pin;
	
	public Doctor() {
		super();
	}

	
	public Doctor(String name, String moblie, String email, String password, String speciality, String description,
			String state, String district, String pin) {
		super();
		this.name = name;
		this.moblie = moblie;
		this.email = email;
		this.password = password;
		this.speciality = speciality;
		this.description = description;
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

	public String getMoblie() {
		return moblie;
	}

	public void setMoblie(String moblie) {
		this.moblie = moblie;
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

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
