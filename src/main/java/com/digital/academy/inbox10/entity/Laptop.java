package com.digital.academy.inbox10.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "studet_laptop")
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "serial_number")
	private int id;
	@Column(name = "laptop_model")
	private String model;
	
	@OneToOne
	@JoinColumn(name = "student_number")
	
	private Student student;
	
	
	public Laptop(String model) {
		super();
		this.model = model;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	

}
