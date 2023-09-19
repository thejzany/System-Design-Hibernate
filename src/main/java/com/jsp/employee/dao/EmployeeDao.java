package com.jsp.employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.employee.dto.Employee;

public class EmployeeDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("thejzany");

	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Employee saveEmployee(Employee employee) {

		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();

		return employee;
	}

	public Employee deleteEmployeeById(int id) {

		Employee employee = entityManager.find(Employee.class, id);

		if (employee != null) {

			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();

		} else {

			System.out.println("Not Deleted");

		}

		return employee;
	}

	public Employee updateEmailById(int id, String mail) {

		Employee employee = entityManager.find(Employee.class, id);

		employee.setMail(mail);

		if(employee!=null) {
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();

			
		}
			
		return employee;
		
		
	}

	public Employee getEmployeeById(int id) {

		Employee employee = entityManager.find(Employee.class, id);

		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getMail());

		return employee;

	}

	public List<Employee> getAllEmployees() {

		String sql = "SELECT e FROM Employee e";
		Query query = entityManager.createQuery(sql);
		List<Employee> employees = query.getResultList();
		for (Employee e : employees) {
			System.out.println("==============	");
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getMail());
			System.out.println("==============");

		}
		return employees;
	}
}
