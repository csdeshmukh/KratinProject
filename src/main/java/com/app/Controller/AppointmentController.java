package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Dto.Appointmentdto;
import com.app.Entity.Aoppointment;
import com.app.Service.AppointmentServ;

@RestController
@RequestMapping("/appo")
// Using this patient can fix appointment with doctor
public class AppointmentController {
//This is Appointment Controller User can Fixed Appointment with Doctor or Doctor Can Set Appointment with  a patient
	@Autowired
	private AppointmentServ ser;
     // after registration of doctor and user, appointment can be fixed using this functionality.
	// URL for hitting this method is --> http://localhost:7070/appo/ment
	@PostMapping("/ment")
	public String asppointment(@RequestBody Appointmentdto dto)
	{
//		System.out.println("Inside in there Appointment");
ser.CreateAppointment(dto);
	   // successful appointment will return String as appointment successful.
		return "Appointment Succefully";
	}
	// For postman Testing the data is as follows
	/*
	 {
    "appointment":"2023-08-10",
    "description":"For hedach",
    "time":"18:20:00",
    "user":"1",
    "doctor":"1"
     }
	 */
}
