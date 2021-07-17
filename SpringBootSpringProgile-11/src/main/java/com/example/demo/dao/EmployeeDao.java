package com.example.demo.dao;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.bean.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	
	List<Employee> findByEmpName(String name);
	List<Employee> findByempSalaryBetween(float lower, float higher);
	
	
	@Query("from Employee where empName=:name")
	List<Employee> getUsingEmpName(@Param("name") String name);
	
	@Query("from Employee where empSalary>=:lower and empSalary<=:higher")
	List<Employee> getUsingEmpSlaryBetween(@Param("lower") float lower , @Param("higher") float higher);
	
	

}
