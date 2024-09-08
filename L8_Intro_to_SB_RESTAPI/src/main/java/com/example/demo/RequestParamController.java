package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {
	@RequestMapping("/test")
	public Message test() {
		Message msg=new Message();
		msg.setMsg("Rest API is working.");
		return msg;
	}
	@GetMapping("/getTest")
	public String getTest() {
		return "Get Request is working";
	}
	@GetMapping("/student")
	public Student getStudent() {
		Student student=new Student(1, "Kundan", 12);
		student.setAddress(new Address("Delhi", 721657));
		return student;
	}
	//3 Ways to pass
	//1. Request Body
	//2. Path Variable
	//3. Request Param
	@RequestMapping("/test/{name}")
	public String pathExample(@PathVariable String name) {
		return "I love you "+name;
	}
	
	@RequestMapping("/test/{name}/{id}")
	public String pathExample(@PathVariable int id,@PathVariable String name) {
		return "I love you "+name+" ID "+id;
	}
	
	//localhost:8080/profile?name=kundan
	//localhost:8080/<path variable>?<Request Param>&<Request Param>
	@RequestMapping("/")
	public String paramExample(@RequestParam String name) {
		return "I love you "+name;
	}
	
	@RequestMapping("/{name}/{id}/")
	public String patnParamExample(@RequestParam String address, @PathVariable String name, @PathVariable int id) {
		return "My name is "+name+" and ID : "+id+" address "+address;
	}
	
	@PostMapping("/studentDetails")
	public String studentDetails(@RequestBody Student student) {
		System.out.println(student);
		student.setAddress(new Address("Patna", 800003));
		return student.toString();
	}
	
}
