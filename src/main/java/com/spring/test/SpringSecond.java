package com.spring.test;

public class SpringSecond {
	private int carNumber;
	private String carName;
	public void print()
	{
		System.out.println("Car number "+carNumber);
		System.out.println("Car Name "+carName);
			}
	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	

}
