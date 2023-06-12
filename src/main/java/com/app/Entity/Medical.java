package com.app.Entity;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medical extends BaseEntity {
@Column
	private String name;
	private String email;
	private String password;
	private LocalTime  openningtime;
	private LocalTime closetime;
	private  String mobileno;
	private String state;
	private String distict;
	private String pin;
	
	public Medical() {
		super();
	}

	public Medical(String name, String email, String password, LocalTime openningtime, LocalTime closetime, String mobileno,
			String state, String distict, String pin) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.openningtime = openningtime;
		this.closetime = closetime;
		this.mobileno = mobileno;
		this.state = state;
		this.distict = distict;
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

	public LocalTime getOpenningtime() {
		return openningtime;
	}

	public void setOpenningtime(LocalTime openningtime) {
		this.openningtime = openningtime;
	}

	public LocalTime getClosetime() {
		return closetime;
	}

	public void setClosetime(LocalTime closetime) {
		this.closetime = closetime;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistict() {
		return distict;
	}

	public void setDistict(String distict) {
		this.distict = distict;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
		
	}

	
	
}
