package com.kmdms.web.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kmdms.pojo.Student;
import com.kmdms.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentHandler{
	
	@Autowired
	private StudentService studentService; 
	
	@RequestMapping("/add")
	public String addStudent(Student stu,HttpServletRequest request){
		studentService.addStudent(stu);
		return "success";
	}
}
