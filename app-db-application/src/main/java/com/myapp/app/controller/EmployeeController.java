package com.myapp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.app.model.Employee;
import com.myapp.app.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@GetMapping("/employee/get")
	public Object getEmployee() {
		
		
		return employeeRepository.findAll();
	}
	
	
	@PostMapping("/create/employee")
	public Object createEmployeeRecord(@RequestBody Employee employee) {
		
		Employee save = employeeRepository.save(employee);
		
		
		return save;
	}
}
