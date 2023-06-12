package com.app.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entity.Doctor;
@Repository
public interface Doctordao extends JpaRepository<Doctor, Long> {

	List<Doctor> findByPin(String pin);
	
	
}
