package com.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.AppointmentDao;
import com.app.Dao.Doctordao;
import com.app.Dao.UseraDao;
import com.app.Dto.Appointmentdto;
import com.app.Entity.Aoppointment;
import com.app.Entity.Doctor;
import com.app.Entity.Users;
@Service
public class AppointmentServImp implements AppointmentServ {

	@Autowired
	private Doctordao doctdao;
	
	@Autowired
	private UseraDao userdao;
	
	 @Autowired
	 private AppointmentDao appointmentDao;
	@Override
	public String CreateAppointment(Appointmentdto dto) {
		System.out.println(dto.getDoctor());
		System.out.println(dto.getUser());
		
		Doctor doct=doctdao.findById(dto.getDoctor()).get();
		Users user=userdao.findById(dto.getUser()).get();
		System.out.println(doct.getEmail());
		System.out.println(user.getEmail());
		Aoppointment app=new Aoppointment(dto.getAppointment(),dto.getDescription(),dto.getTime());
		app.setUser(user);
		app.setDoctor(doct);
		appointmentDao.save(app);
		
		return "Appointment Sucessfully";
	}

	
}
