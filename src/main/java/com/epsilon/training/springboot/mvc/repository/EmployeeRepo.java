package com.epsilon.training.springboot.mvc.repository;

import org.springframework.data.repository.CrudRepository;

import com.epsilon.training.springboot.mvc.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

}
