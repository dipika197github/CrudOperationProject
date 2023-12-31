package com.crud.saksoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.saksoft.model.Employee;
import com.crud.saksoft.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	// save the employee data
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);

	}

	// update the employee data

	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);

	}

	// fetch all employee data

	public List<Employee> getAllEmployee() {
		return (List<Employee>) employeeRepository.findAll();

	}

	// fetch employee data based on id
	public Employee findByEmployeeId(Integer id) {
		return employeeRepository.findById(id);

	}

	// delete by id employee data

	public void deleteByEmployeeId(Integer id) {
		employeeRepository.deleteById(id);

	}
}
