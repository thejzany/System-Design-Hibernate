package com.jsp.employee.controller;

import com.jsp.employee.service.EmployeeService;

public class EmployeeUpdate {
	public static void main(String[] args) {
		
		EmployeeService employeeService=new EmployeeService();
		
		employeeService.updateEmailById(1,"jays@mail.com");
		
	}
}
