package com.example.demo.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.model.StudentRequestModel;
import com.example.demo.model.StudentResponseModel;
import com.example.demo.service.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	
	@GetMapping("/test")
	public String test() {
		return "Test API works";
	}
	
	@PostMapping("/create")
	public StudentResponseModel create(@RequestBody StudentRequestModel request) {
		return studentService.create(request);
	}
	
	@PutMapping("/update/{id}")
	public void updateStudent(@PathVariable int id,@RequestBody StudentRequestModel request) {
		studentService.updateStudent(id,request);
	}
	@GetMapping("/get/{id}")
	public Student getStudent(@PathVariable int id) {
		return studentService.getStudent(id);
	}
	
	@GetMapping("/get")
	public ArrayList<Student> getAll() {
		return studentService.getAll();
	}
	
	@DeleteMapping("delete/{id}")
	public Student deleteId(@PathVariable int id) {
		return studentService.deleteId(id);
	}
	
}
