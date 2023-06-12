package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Dao.MedicalDao;
import com.app.Entity.Medical;
import com.app.Service.MedialServices;

@RestController
@RequestMapping("/medical")
// This is for registration of Medical person / pharmacy
// To register we need to hit url ==> http://localhost:7070/medical/signup
public class MedicalController {

	@Autowired
	private MedialServices medser;
	
	@Autowired 
	private MedicalDao dao;
	
	@GetMapping("/find")
	public String addMedicalData() {
		Long sf=(long) 2;
		Medical me=dao.findById(sf).get();
		System.out.println(me.getEmail());
//	String str=	medser.addMediacal(med);
		return "Chetan";
	}
	@PostMapping("/signup")
	public String findById(@RequestBody Medical med) {
	String str=	medser.addMediacal(med);
		return str;
	}
	
	
	@GetMapping("/getAllmedical")
	public ResponseEntity<?> getAlluser(){
		return new ResponseEntity<>(dao.findAll(),HttpStatus.OK);
	}
	// Sample data for POSTMAN Testing is as follows
	/*
	 {
   "name":"Moriya Medical",

    "email":"moryaMedical123@gmail.com",
    "password":"medical@123",
    "openningtime":"08:20:00",
    "closetime":"20:00:00",
    "distict":"pune",

    "mobileno":"9876543210",
    "state":"Maharashtra",
    "district":"Pune",
    "pin":"412215"

}
	 */
}
