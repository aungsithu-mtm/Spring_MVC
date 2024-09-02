package com.student.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.student.repository.StudentRepository;
import com.student.entity.Employee;

@Service
public class StudentService {
	private StudentRepository studentRepository;
	
	public List<Employee> getAllStudents(){
		return studentRepository.findAll();
	}
	
	public Employee saveStudent(Employee employee) {
		return studentRepository.save(employee);
	}
}
