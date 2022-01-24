package com.zensar.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.training.dto.EmployeeDTO;
import com.zensar.training.service.EmployeeService;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/")
	public String isRunning() {
		return "MACY Order Application is running.....";
	}
	
	@PostMapping("/save/employee")
	public String saveEmployeeInfo(@RequestBody EmployeeDTO employee) {
		return employeeService.saveEmployeeInfo(employee);
	}
	
	@GetMapping("/get/employee/byId/{id}")
	public EmployeeDTO getEmployee(@PathVariable(value = "id") int id) {
		return employeeService.getEmployee(id);
	}

}
