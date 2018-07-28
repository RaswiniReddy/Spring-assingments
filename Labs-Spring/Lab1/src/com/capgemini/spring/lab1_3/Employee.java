package com.capgemini.spring.lab1_3;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	@Autowired
	private SBU businessUnit;
	private int empAge;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public SBU getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}
	
	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	@Override
	public String toString() {
		return "Employee [empAge=" + empAge + ", employeeId=" + employeeId + ", employeeName=" + employeeName
				+ ", salary=" + salary + "]\n";
	}

}
