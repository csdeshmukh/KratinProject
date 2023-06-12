package com.app.Service;

import org.springframework.stereotype.Service;

import com.app.Entity.Users;

@Service
public interface UserServices {

	public String SaveUser(Users user);
}
