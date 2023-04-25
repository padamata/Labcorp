package com.venkata.labcorp.model;

import java.io.Serializable;

public class Employee implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	private long id;

	private float vacationDays;
	
	private String employeeName;
	
	private String employeeType;
	


	

	public float getVacationDays() {
		return vacationDays;
	}

	public void setVacationDays(float vacationDays) {
		this.vacationDays = vacationDays;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}



	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}



	
	
	

}
