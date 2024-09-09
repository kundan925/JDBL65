package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.model.StudentRequestModel;
import com.example.demo.model.StudentResponseModel;

@Service
public class StudentService {
	
	HashMap<Integer, Student> studentHashMap;
	
	public StudentResponseModel create(StudentRequestModel request) {
		if(studentHashMap==null) {
			studentHashMap=new HashMap<Integer, Student>();
		}
		Student s=new Student(request.getName(),request.getEmail(),request.getPassword());
		s.setId(getRandomNumber());
		if(studentHashMap.containsKey(s.getId())) {
			s.setId(getRandomNumber());
		}
		studentHashMap.put(s.getId(), s);
		
		StudentResponseModel response=new StudentResponseModel(s.getId(), s.getName(), s.getEmail(), s.getPassword());
		
		return response;
	}
	
	public void updateStudent(int id, StudentRequestModel request) {
		if(studentHashMap==null) {
			studentHashMap=new HashMap<Integer, Student>();
		}
		Student s=new Student(request.getName(),request.getEmail(),request.getPassword());
		
		studentHashMap.put(id, s);
		
		
	}
	
	public Student getStudent(int id) {
		Student s=null;
		if(studentHashMap==null) {
			System.out.println("Student not created with this id.");
		}
		if(studentHashMap.containsKey(id)) {
			s=studentHashMap.get(id);
		}
		return s;
	}
	public ArrayList<Student> getAll(){
		ArrayList<Student> lStudents=new ArrayList<Student>();
		if(studentHashMap==null) {
			System.out.println("HashMap is empty.");
		}
		
		for(Map.Entry<Integer, Student> entry : studentHashMap.entrySet()) {
			lStudents.add(entry.getValue());
		}
		return lStudents;
	}
	
	public Student deleteId(int id) {
		if(studentHashMap==null) {
			System.out.println("Student not created with given ID.");
		}
		
		return studentHashMap.remove(id);
	}
	private int getRandomNumber() {
		int min=1;
		int max=10000;
		return (int)((Math.random()*(max-min))+min);
	}
}
