package com.digital.academy.inbox10.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_student")
public class Student{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_number")
	private int id;
	@Column(name = "first_name")
	private String name;
	@Column(name = "last_name")
	private String surname;
	@Column(name = "gender")
	private String gender;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String surname, String gender) {
		super();
		
		this.name = name;
		this.surname = surname;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", gender=" + gender + "]";
	}

}
