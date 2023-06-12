package com.app.Dto;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.app.Entity.Doctor;
import com.app.Entity.Users;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Appointmentdto {


	private Date appointment;
	private String description;
	private LocalTime time;
private Long user;
	private Long doctor;
	public Appointmentdto() {
		super();
	}
	public Appointmentdto(Date appointment, String description, LocalTime time, Long user, Long doctor) {
		super();
		this.appointment = appointment;
		this.description = description;
		this.time = time;
		this.user = user;
		this.doctor = doctor;
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
	public Long getUser() {
		return user;
	}
	public void setUser(Long user) {
		this.user = user;
	}
	public Long getDoctor() {
		return doctor;
	}
	public void setDoctor(Long doctor) {
		this.doctor = doctor;
	}
	
	
	
}
