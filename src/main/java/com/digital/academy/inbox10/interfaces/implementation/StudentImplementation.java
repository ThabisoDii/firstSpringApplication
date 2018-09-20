package com.digital.academy.inbox10.interfaces.implementation;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.digital.academy.inbox10.entity.Student;
import com.digital.academy.inbox10.interfaces.classes.StudentInterface;
import com.digital.academy.inbox10.interfaces.service.StudentRepository;


@Component
public class StudentImplementation implements StudentInterface{
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Optional<Student> searchStudet(int id) {
		// TODO Auto-generated method stub
		
		
		return studentRepository.findById(id);
	}

	@Override
	public String addStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
		
		return ""+studentRepository.save(student);
	}

	@Override
	public ArrayList<Student> getAllStudents() {
		// TODO Auto-generated method stub
		
		ArrayList<Student> listStudents = (ArrayList<Student>)studentRepository.findAll();
		return listStudents;
	}

}
