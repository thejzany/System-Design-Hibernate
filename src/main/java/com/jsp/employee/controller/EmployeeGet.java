package com.jsp.employee.controller;

import com.jsp.employee.service.EmployeeService;

public class EmployeeGet {
public static void main(String[] args) {
	EmployeeService employeeService=new  EmployeeService();
	employeeService.getEmployeeById(1);
}
}
