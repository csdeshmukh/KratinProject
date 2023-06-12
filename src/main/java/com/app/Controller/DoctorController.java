package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Dao.Doctordao;
import com.app.Entity.Doctor;

@RestController
@RequestMapping("doctor")
// Here we can register as a doctor
// for this functionality we can hit the url ==> http://localhost:7070/doctor/save
public class DoctorController {

	@Autowired
	private Doctordao dao;
	
	@PostMapping("save")
	public String registerDoctor(@RequestBody Doctor dtr) {
		
		dao.save(dtr);
		return "Add succesfull";
	}
	
	// The Sample data for POSTMAN Testing is as follows
	/*
	 * {
    "name":"Morya Hospital",
    "moblie":"9876543210",
    "email":"abc@gmail.com",
    "password":"abc@1234",
    "speciality":"for Head",
    "description":"for good health",
    "state":"Maharashtra",
    "district":"Pune",
    "pin":"412215"
}
	 */
}
