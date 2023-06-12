package com.app.Entity;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Aoppointment extends BaseEntity implements Serializable {

	private Date appointment;
	private String description;
	private LocalTime time;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name = "UserId", nullable = false)
	private Users user;
	@ManyToOne(fetch = FetchType.EAGER)
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@JsonIgnore
	@JoinColumn(name = "doctorId", nullable = false)
	private Doctor doctor;

	public Aoppointment() {
		super();
	}

	public Aoppointment(Date appointment, String description, LocalTime time) {
		super();
		this.appointment = appointment;
		this.description = description;
		this.time = time;
		
	}

	public Date getAppointment() {
		return appointment;
	}

	public void setAppointment(Date appointment) {
		this.appointment = appointment;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


}
