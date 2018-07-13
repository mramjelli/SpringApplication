package com.spring.test;

public class SpringFirst {
	private String empName;
	private int age;
	public void print()
	{
		System.out.println("Employee Name "+empName);
		System.out.println("your age "+age);
	
	}
	public String getEmpName() {
		return empName;
		}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
}
