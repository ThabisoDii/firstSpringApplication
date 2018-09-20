package com.digital.academy.inbox10.interfaces.classes;

import java.util.ArrayList;
import java.util.Optional;

import com.digital.academy.inbox10.entity.Student;

public interface StudentInterface {
	
	public Optional <Student> searchStudet(int id);
	public String addStudent(Student student);
	public ArrayList<Student> getAllStudents();
	
	

}
