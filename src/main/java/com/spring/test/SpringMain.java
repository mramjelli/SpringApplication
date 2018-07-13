package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String args[])
	{
		System.out.println("Hello Spring");
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		SpringFirst firstObj = (SpringFirst) context.getBean("malli");
		SpringSecond secObj = (SpringSecond) context.getBean("arjun");
		firstObj.print();
		secObj.print();
		firstObj.setEmpName("Malli");
		firstObj.setAge(24);
		secObj.setCarNumber(23544);
		secObj.setCarName("maruthi");
		System.out.println("Emp name " +firstObj.getEmpName());
		System.out.println("age " +firstObj.getAge());
		System.out.println("car Name " +secObj.getCarName());
		System.out.println("car Number " +secObj.getCarNumber());
		firstObj.print();
	}
}
