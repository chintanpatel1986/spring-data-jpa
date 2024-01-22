package org.chintanpatel.app.service;

import org.chintanpatel.app.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    void addEmployee(Employee employee);

    List<Employee>getAllEmployeeList();

    Optional<Employee>findEmployeeById(int employeeId);

    void deleteEmployeeById(int employeeId);
}
