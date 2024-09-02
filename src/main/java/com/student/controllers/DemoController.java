package com.student.controllers;
//import required class
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.student.models.Student;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RequestMapping("/student.com")
public class DemoController {

    @GetMapping("/test")
    public String helloWorld(Model model) {
    	Student student = new Student("Aung Aung", 23, "Second year");
    	model.addAttribute("student", student);
        return "view/test";
    }
    
    @GetMapping("/test/list")
    public String studentList(Model model) {
    	List<Student> students = new ArrayList<>();
    	students.add(new Student("AST", 20, "Sophomore"));
    	students.add(new Student("MMMT", 14, "Fresher"));
    	students.add(new Student("TMH", 40, "Second Year"));
    	
    	model.addAttribute("students", students);
    	return "view/testList";
    }
    
    @ResponseBody
    @GetMapping("/test/list/api")
    public List<Student> studentApi() {
    	List<Student> students = new ArrayList<>();
    	students.add(new Student("AST", 20, "Sophomore"));
    	students.add(new Student("MMMT", 14, "Fresher"));
    	students.add(new Student("TMH", 40, "Second Year"));
    	return students;
    }
}
