package com.crud.generic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.crud.generic.entity.baseEntity.BaseEntity;

@Entity
@Table(name = "person")
public class Person extends BaseEntity{
	
	@Column(name = "email", nullable = false,length = 200)

	private String email;
	private String NIM;
	public Person() {
		super();		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNIM(String NIM){
		this.NIM = NIM;
	}
	public String getNIM(){
		return this.NIM;
	}
}
