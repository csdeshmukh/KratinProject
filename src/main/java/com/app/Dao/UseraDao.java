package com.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.app.Entity.Users;

@Repository
public interface UseraDao extends JpaRepository<Users, Long> {

	
}
