package com.jsp.employee.service;

import java.util.List;

import com.jsp.employee.dao.EmployeeDao;
import com.jsp.employee.dto.Employee;

public class EmployeeService {

	EmployeeDao employeeDao = new EmployeeDao();

	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();

	}

	public Employee getEmployeeById(int id) {
		return employeeDao.getEmployeeById(id);
	}

	public Employee updateEmailById(int id, String mail) {
		return employeeDao.updateEmailById(id, mail);
	}

	public Employee deleteEmployeeById(int id) {
		return employeeDao.deleteEmployeeById(id);
	}

	public Employee saveEmployee(Employee employee) {
		return employeeDao.saveEmployee(employee);
	}
}
