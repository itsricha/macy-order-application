package com.zensar.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "employee")
public class EmployeeDAO {
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "id")
	@Id
	private int id;
	
	@Column(name = "phonenumber")
	private int phone;
	
	@Column(name = "department")
	private String depart;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

}
