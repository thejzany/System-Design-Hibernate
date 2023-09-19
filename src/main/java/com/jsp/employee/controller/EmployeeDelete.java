package com.jsp.employee.controller;

import com.jsp.employee.service.EmployeeService;

public class EmployeeDelete {

	public static void main(String[] args) {
		
	EmployeeService employeeService=new  EmployeeService();
	employeeService.deleteEmployeeById(5);

	}
}
