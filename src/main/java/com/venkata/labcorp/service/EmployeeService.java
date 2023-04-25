package com.venkata.labcorp.service;

import com.venkata.labcorp.model.Employee;

public interface EmployeeService {
	
	public Employee work(String employeeType);
	public Employee TakeVacation(float vacationDays,String employeeType);

}
