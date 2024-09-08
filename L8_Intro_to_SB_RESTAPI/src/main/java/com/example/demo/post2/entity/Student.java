package com.example.demo.post2.entity;

import java.util.Arrays;


public class Student {
	private int id;
	private String name;
	private int roll;
	private String arr[]={"Hindi","English"};
	public Student(int id, String name, int roll) {
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String[] getArr() {
		return arr;
	}
	public void setArr(String[] arr) {
		this.arr = arr;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", roll=" + roll + ", address=" + ", arr="
				+ Arrays.toString(arr) + "]";
	}
	
	
}
