package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Dao.Doctordao;
import com.app.Dao.MedicalDao;
import com.app.Dto.UserDto;
import com.app.Entity.Doctor;
import com.app.Entity.Medical;
import com.app.Entity.Users;
import com.app.Service.UserServices;
@RestController
@RequestMapping("user")

public class UserController {

	@Autowired
	private UserServices ser;
	@Autowired
	private MedicalDao meddao;
	
	@Autowired
	private Doctordao docDao;

	// This is for user Registration
	// To use this functionality hit the URL ==> http://localhost:7070/user/signup
	@PostMapping("/signup")
	public ResponseEntity<?> UserLogin(@RequestBody Users use) {
	
	String str=	ser.SaveUser(use);
		return new ResponseEntity<>(str,HttpStatus.OK);
	}
//	User can finding a medical based on a his pincode 
	@PostMapping("findpin/{pin}")
	public ResponseEntity<?> findBypin(@PathVariable String pin){
		System.out.println("Inside find By Pin");
	List<Medical> med =	meddao.findByPin(pin);
	if(med.isEmpty())
		return new ResponseEntity<>("No Medical Near You",HttpStatus.OK);
	
		return new ResponseEntity<>(med,HttpStatus.OK);
		
	}
	// Sample data for POSTMAN Testing is as follows
	/*{
    "name":"Anand",
    "email":"anandk@gmail.com",
    "password":"9876543210",
    "mobile":"9876543210",
    "state":"maharashtra",
    "district":"Amravati",
    "pin":"444606"
}
	 * 
	 */
	
	//Finding Hospital nearby using PinCode 
	
	@PostMapping("finddoct/{pin}")
	public ResponseEntity<?> findBypinDoct(@PathVariable String pin){
		System.out.println("Inside find By Pin");
	List<Doctor> med =	docDao.findByPin(pin);
	if(med.isEmpty())
		return new ResponseEntity<>("No Hospital Near You",HttpStatus.OK);
//	
		return new ResponseEntity<>(med,HttpStatus.OK);
		
	}
	
	
}
