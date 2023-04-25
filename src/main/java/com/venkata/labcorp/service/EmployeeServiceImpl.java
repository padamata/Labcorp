package com.venkata.labcorp.service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.venkata.labcorp.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private float vacationDays = 0;
	
	private final AtomicLong counter = new AtomicLong();

	@Override
	public Employee work(String employeeType) {
		// TODO Auto-generated method stub
		if (employeeType != null && employeeType.contains("hourlyEmployee")) {
			vacationDays = 10;
		} else if (employeeType != null && employeeType.contains("salariedEmployee")) {
			vacationDays = 15;
		} else if (employeeType != null && employeeType.contains("managerEmployee")) {
			vacationDays = 30;
		}
		Employee emp = new Employee();
		emp.setId(counter.incrementAndGet());
		emp.setEmployeeName("siva");
		emp.setEmployeeType(employeeType);
		emp.setVacationDays(vacationDays);
		return emp;
	}

	@Override
	public Employee TakeVacation(float vacationDays, String employeeType) {
		// TODO Auto-generated method stub
		float vacationDaysRemains = 0;
		Employee emp = new Employee();
		
		if (employeeType != null && employeeType.contains("hourlyEmployee")) {
			vacationDaysRemains = 10 - vacationDays;
			emp.setVacationDays(vacationDaysRemains);
		} else if (employeeType != null && employeeType.contains("salariedEmployee")) {
			vacationDays = 15 - vacationDays;
			emp.setVacationDays(vacationDaysRemains);
		} else if (employeeType != null && employeeType.contains("managerEmployee")) {
			vacationDays = 30 - vacationDays;
			emp.setVacationDays(vacationDaysRemains);
		}
		emp.setId(counter.incrementAndGet());
		emp.setEmployeeName("siva");
		emp.setEmployeeType("hourlyEmployee");
		return emp;
	}

}
