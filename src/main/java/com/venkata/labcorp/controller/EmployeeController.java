package com.venkata.labcorp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.venkata.labcorp.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

	@GetMapping("/work")
	public String work(@RequestParam(value = "", defaultValue = "") String employeeType) {

		
		//System.out.println(new Gson().toJson(employeeServiceImpl.work(employee)));
		return new Gson().toJson(employeeServiceImpl.work(employeeType));
	}

	@GetMapping("/vacation")
	public String vacation(@RequestParam(value = "", defaultValue = "") float vacationDays, String employeeType) {
		
		return new Gson().toJson(employeeServiceImpl.TakeVacation(vacationDays,employeeType));
	}

}
