package com.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.Doctordao;
import com.app.Entity.Doctor;
@Service
public class DoactorServiceImp implements DoctorServices {

	@Autowired
	private Doctordao dao;
	
	@Override
	public String addDoctor(Doctor doa) {
		// TODO Auto-generated method stub
		dao.save(doa);
		return "Add successfully";
	}

	
	
	
	
}
