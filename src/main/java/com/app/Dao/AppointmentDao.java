package com.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entity.Aoppointment;
@Repository
public interface AppointmentDao extends JpaRepository<Aoppointment, Long> {

}
