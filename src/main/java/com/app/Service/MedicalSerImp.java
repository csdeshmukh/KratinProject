package com.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.MedicalDao;
import com.app.Entity.Medical;
@Service
public class MedicalSerImp  implements MedialServices{

	@Autowired
	private MedicalDao dao;
	
	
	@Override
	public String addMediacal(Medical med) {
		// TODO Auto-generated method stub
		dao.save(med);
		return "Add Successfully";
	}

}
