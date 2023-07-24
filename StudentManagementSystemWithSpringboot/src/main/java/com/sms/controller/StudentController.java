package com.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.entity.Student;
import com.sms.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@PostMapping("/createstudent")
	Student addStudent(@RequestBody Student student)
	{
		return studentService.addStudent(student);
	}
	
	@GetMapping("/getstudents")
	List<Student> getAllStudents()
	{
		return studentService.getAllStudents();
		
	}
	
	@GetMapping("/getstudentById/{id}")
	Student getStudentById(@PathVariable int id)
	{
		return studentService.getStudentById(id);
	}
	
	@PutMapping("/updateStudentById/{id}")
	Student updateStudent(@PathVariable int id, @RequestBody  Student student)
	{
		
		return studentService.updateStudent( id,student);
		
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	String deleteStudentById(@PathVariable int id)
	{
		return studentService.deleteStudent(id);
	}
	
	

}
