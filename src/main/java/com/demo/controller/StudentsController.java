package com.demo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

@Controller
public class StudentsController {
	
	public StudentService stservice;
	
	
	public StudentsController() {
		stservice=new StudentServiceImpl();
		
	}
    
	@RequestMapping("/studentPage")
	public String studentPage(Model model) {
		return "studentPage";
	}
	
	@RequestMapping("/studentRegister")
    public String studentRegister(Model model) {
    	return "studentRegister";
    }
	
	
	
	@RequestMapping("/RegisterStudent")
	public String RegisterStudent(Model model, @ModelAttribute Student student) {
		
		model.addAttribute("std",student);
		stservice.addStudent(student);
		
		return "studentPortal";
	}
}
