package com.app.Service;

import org.springframework.stereotype.Service;

import com.app.Dto.Appointmentdto;
@Service
public interface AppointmentServ {
public String  CreateAppointment(Appointmentdto dto );
}
