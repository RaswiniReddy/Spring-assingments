package com.capgemini.spring.lab1_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.spring.lab1_2.Employee;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext2.xml");
		Employee emp=(Employee) context.getBean("employee");
		System.out.println("Employee Details");
		System.out.println("-----------------------");
		System.out.println(emp);
		System.out.println("sbu details="+emp.getSbuDetails());
	}

}
