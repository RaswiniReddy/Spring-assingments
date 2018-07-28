package com.capgemini.spring.lab1_4;

import java.util.Map;

public class EmployeeDao {
	Map<Integer, Employee> hmap;

	public EmployeeDao(Map<Integer, Employee> hmap) {
		super();
		this.hmap = hmap;
	}

	public EmployeeDao() {
	}

	public Employee get(int empId) {
		boolean temp = hmap.containsKey(empId);
		if (temp) {
			return (Employee) hmap.get(empId);
		}
		return null;
	}
}
