package com.javainuse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Student;
import com.javainuse.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/saveDetails")
	public Student saveDetails( @RequestBody Student student)
	{
		return studentService.saveDetails(student);
	}
	
	@GetMapping("/getDetails")
	public List<Student> getDetails()
	{
		return studentService.getDetails();
	}
}
