package com.crud.saksoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.saksoft.model.Employee;
import com.crud.saksoft.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	//// save the employee data
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);

	}

	// update the employee data
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);

	}

	// fetch all employee data
	@GetMapping("/getAllEmployee")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();

	}

	// fetch employee data based on id
	@GetMapping("/findByEmployeeId/{id}")
	public Employee findByEmployeeId(@PathVariable("id") Integer id) {
		return employeeService.findByEmployeeId(id);

	}

	// delete all employee data
	@DeleteMapping("/deleteByEmployeeId/{id}")
	public void deleteByEmployeeId(@PathVariable("id") Integer id) {
		employeeService.deleteByEmployeeId(id);
	}
}
