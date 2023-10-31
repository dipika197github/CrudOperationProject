package com.crud.saksoft.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.saksoft.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Serializable>{

	public Employee findById(Integer id);
}
