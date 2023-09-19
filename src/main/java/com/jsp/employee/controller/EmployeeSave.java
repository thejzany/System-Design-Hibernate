package com.jsp.employee.controller;

import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class EmployeeSave {
public static void main(String[] args) {
	
	EmployeeService employeeService=new EmployeeService();
	
	Employee employee= new Employee();
	employee.setName("xyz");
	employee.setMail("xyz@mail.com");
	employeeService.saveEmployee(employee);
	
}
}
