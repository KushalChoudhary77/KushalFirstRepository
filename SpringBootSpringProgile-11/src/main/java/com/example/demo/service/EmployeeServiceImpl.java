package com.example.demo.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Employee;
import com.example.demo.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl {
	
	@Autowired
	EmployeeDao dao;
	
	public List<Employee> getAllEmployees(){
		return dao.findAll();
		
	}
	
	public List<Employee> findByEmpName(String name) {
		
		return dao.findByEmpName(name);
		
	}
	
	public List<Employee> findByempSalaryBetween(float lower , float higher) {
		
		return dao.findByempSalaryBetween(lower,higher);
		
	}
	
	public List<Employee> getUsingEmpName(String name) {
		
		return dao.getUsingEmpName(name);
		
	}
	
	public List<Employee> getUsingEmpSlaryBetween(float lower , float higher) {
		
		return dao.getUsingEmpSlaryBetween(lower,higher);
		
	}
	
	public Employee getEmployeeWithID(int empID) {
		
		return dao.getById(empID);
		
	}
	
	public Employee addEmployee(Employee emp) {
		return dao.save(emp);
		
	}
	
	public Employee updateEmployee(int empID,Employee emp) {
		
		
		return dao.save(emp);
	}
	
	public void removeEmployee(int empId) {
		
		dao.deleteById(empId);
		
		
	}

	
}
