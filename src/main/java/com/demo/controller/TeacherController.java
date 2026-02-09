package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeacherController {
     
	@RequestMapping("/teacherPage")
	public String teacherPage(Model model) {
		return "teacherPage";
	}
}
