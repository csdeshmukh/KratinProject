package com.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.UseraDao;
import com.app.Entity.Users;

@Service
public class UserImp implements UserServices {
	@Autowired
	private UseraDao dao;
	


	@Override
	public String SaveUser(Users user) {
		// TODO Auto-generated method stub
		dao.save(user);
		return "add succesfully";
	}

}
