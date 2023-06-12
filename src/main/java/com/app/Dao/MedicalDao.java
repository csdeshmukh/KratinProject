package com.app.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entity.Medical;
@Repository
public interface MedicalDao extends JpaRepository<Medical, Long>{
	List<Medical> findByPin(String pin);
}
