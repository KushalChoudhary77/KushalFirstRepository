package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int empID;
	private String empName;
	private float empSalary;
	
	public Employee(int empID, String empName, float empSalary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	

	
}
