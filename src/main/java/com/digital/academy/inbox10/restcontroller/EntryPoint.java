package com.digital.academy.inbox10.restcontroller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.digital.academy.inbox10.entity.Student;

import com.digital.academy.inbox10.interfaces.implementation.StudentImplementation;

@RestController
@RequestMapping("inbox10")

public class EntryPoint {
	
	@Autowired
	StudentImplementation studentImp;
	@PostMapping("addStudent")
	
	public String addStudent(@RequestParam String name,@RequestParam String surname,@RequestParam String gender) {

		return studentImp.addStudent(new Student(name,surname,gender));
	}
	
	@GetMapping("search")
	public Optional<Student> seachStudent(int id) {
		
		
		return studentImp.searchStudet(id);
	}
	
	@GetMapping("retrieve")
	public ArrayList<Student> getAllStudents(){
		return studentImp.getAllStudents();
	}
	

}
