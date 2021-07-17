package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Employee;
import com.example.demo.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl service;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
		
	}
	
	@GetMapping("/employees/name/{name}")
	public List<Employee> getEmployeeByName(@PathVariable String name) {
		
		return service.findByEmpName(name);
		
	}
	
	@GetMapping("/employees/salary/{lower}/{higher}")
	public List<Employee>  findByempSalaryBetween(@PathVariable float lower ,@PathVariable float higher) {
		
		return service.findByempSalaryBetween(lower,higher);
		
	}
	
	@GetMapping("/employeess/name/{name}")
	public List<Employee> getUsingEmpName(@PathVariable String name) {
		
		return service.getUsingEmpName(name);
		
	}
	
	@GetMapping("/employeess/salary/{lower}/{higher}")
	public List<Employee> getUsingEmpSlaryBetween(@PathVariable float lower ,@PathVariable float higher) {
		
		return service.getUsingEmpSlaryBetween(lower,higher);
		
	}
	
	@GetMapping("/employee/{empID}")
	public Employee getEmployeeWithID(@PathVariable int empID) {
		
		return service.getEmployeeWithID(empID);
		
	}
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp) {
		 service.addEmployee(emp);
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
		
	}
	
	@PutMapping("/employee/{empID}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable int empID,@RequestBody Employee emp) {
		
		return new ResponseEntity<Employee>(service.updateEmployee(empID, emp), HttpStatus.ACCEPTED) ;
	}
	
	@DeleteMapping("/employee/{empID}")
	public void removeEmployee(@PathVariable int empID) {
		
		service.removeEmployee(empID);
		
	}

}
