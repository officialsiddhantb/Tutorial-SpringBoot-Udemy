package com.example.pma.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.pma.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Long>{

}
