package com.app.service;

import java.util.List;

import com.app.entity.Employee;

public interface EmployeeService {
    
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
