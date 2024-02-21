package com.cisco.SpringBootCrud.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Subject_eklavya")
public class Subject {
	
	
	@Id
	private String id;
	private String name;
	
	
	public Subject() {
	}
	
	public Subject(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
