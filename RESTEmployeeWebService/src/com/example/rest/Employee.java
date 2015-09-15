package com.example.rest;

public class Employee {
	public String empID;
	public String name;
	public String email;

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString(){
		return "Employee ID: ["+ empID + " Name: "+ name + " Email: " + email + " ]";
	}
}
