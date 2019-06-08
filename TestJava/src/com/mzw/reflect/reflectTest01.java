package com.mzw.reflect;

public class reflectTest01 implements MyInterface{
	private int id;
	private String name;
	private int age;
	
	public reflectTest01() {
		super();
	}
	public reflectTest01(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	} 
	public int getId() {
		System.out.println("....");
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
