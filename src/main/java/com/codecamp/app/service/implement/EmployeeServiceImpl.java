package com.codecamp.app.service.implement;

import com.codecamp.app.model.Employee;
import com.codecamp.app.repository.EmployeeRepository;
import com.codecamp.app.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Transactional
    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Transactional
    @Override
    public List<Employee> getAllEmployeeList() {
        return employeeRepository.findAll();
    }

    @Transactional
    @Override
    public Optional<Employee> getEmployeeById(int employeeId) {
        return employeeRepository.findById(employeeId);
    }

    @Transactional
    @Override
    public void deleteEmployee(int employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
