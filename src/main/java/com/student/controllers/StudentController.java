package com.student.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.entity.Employee;
import com.student.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService stuService;
	
	@GetMapping
	public String listStudents(Model model) {
        model.addAttribute("students", stuService.getAllStudents());
        return "view/student/list";
    }
    
    @PostMapping
    public String saveStudent(@ModelAttribute Employee student) {
    	stuService.saveStudent(student);
        return "redirect:/view/student/list";
    }
	
}
