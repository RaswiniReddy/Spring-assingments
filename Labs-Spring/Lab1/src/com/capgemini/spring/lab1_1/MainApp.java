package com.capgemini.spring.lab1_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext1.xml");
		Employee emp=(Employee) context.getBean("emp");
		System.out.println("Employee Details");
		System.out.println("-----------------------");
		System.out.println("Employee ID : " +emp.getEmployeeId());
		System.out.println("Employee Name : "+emp.getEmployeeName());
		System.out.println("Employee Salary : "+emp.getSalary());
		System.out.println("Employee BU : "+emp.getBusinessUnit());
		System.out.println("Employee Age : "+emp.getAge());
	}

}
