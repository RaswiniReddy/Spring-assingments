package com.capgemini.spring.lab1_4;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		EmployeeService service;
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext4.xml");
		service=(EmployeeService) context.getBean("employeeService");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int empId = sc.nextInt();
		Employee emp = service.getDetails(empId);
		if (emp != null) {
			System.out.println("Employee Info:");
			System.out.println("Employee ID\t:" + emp.getEmployeeId());
			System.out.println("Employee NAME\t:" + emp.getEmployeeName());
			System.out.println("Employee SALARY\t:" + emp.getSalary());
		} else {
			System.out.println("Invalid Employee ID");
		}
		sc.close();
	}

}
