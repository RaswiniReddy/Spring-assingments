package com.capgemini.spring.lab1_4;

import java.util.Map;

public class EmployeeService {
	Map<Integer, Employee> hmap;

	public EmployeeService() {
	}

	public EmployeeService(Map<Integer, Employee> hmap) {
		this.hmap = hmap;
	}

	public Map<Integer, Employee> getHmap() {
		return hmap;
	}

	public void setHmap(Map<Integer, Employee> hmap) {
		this.hmap = hmap;
	}

	public Employee getDetails(int empId) {

		EmployeeDao serviceDao = new EmployeeDao(this.hmap);
		if (empId != 0) {
			Employee e = serviceDao.get(empId);
			if (e != null) {
				return e;
			}
		}
		return null;
	}
}
