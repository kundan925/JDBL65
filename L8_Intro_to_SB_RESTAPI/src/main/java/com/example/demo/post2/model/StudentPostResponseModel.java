package com.example.demo.post2.model;

public class StudentPostResponseModel {
	private int id;
	private String name;
	private int roll;
	private String arr[]={"Hindi","English"};
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
	public StudentPostResponseModel(int id, String name, int roll) {
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
	}
	public StudentPostResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
}
