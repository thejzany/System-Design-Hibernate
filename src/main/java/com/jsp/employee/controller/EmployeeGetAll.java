package com.jsp.employee.controller;

import com.jsp.employee.service.EmployeeService;

public class EmployeeGetAll {
public static void main(String[] args) {
	EmployeeService employeeService=new  EmployeeService();
	employeeService.getAllEmployees();
}
}
