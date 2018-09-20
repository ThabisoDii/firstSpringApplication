package com.digital.academy.inbox10.interfaces.service;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.digital.academy.inbox10.entity.Student;

@Component
@Service
@Transactional

public interface StudentRepository extends CrudRepository<Student,Integer>{

}
