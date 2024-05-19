package com.codecamp.app.service;

import com.codecamp.app.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    void addEmployee(Employee employee);

    List<Employee> getAllEmployeeList();

    Optional<Employee> getEmployeeById(int employeeId);

    void deleteEmployee(int employeeId);
}
