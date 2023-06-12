package com.app.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
public Long getId(Long id) {
	return this.id;
}
public void setId(Long id) {
	this.id=id;
}


}
