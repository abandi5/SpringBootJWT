package com.javainuse.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.javainuse.config.StudentRepository;
import com.javainuse.model.Student;





@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;

	
	public Student saveDetails(Student student)
	{
		return repo.save(student);
		
	}
	
	
	public List<Student> getDetails()
	{
		return repo.findAll();
	}
	
//	@PutMapping("/update")
//	public Student updateDetails(Student student)
//	{
//		return 
//	}
	
	
}
