package org.chintanpatel.app.service.implement;

import org.chintanpatel.app.domain.Employee;
import org.chintanpatel.app.repository.EmployeeRepository;
import org.chintanpatel.app.service.EmployeeService;
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

    @Override
    @Transactional
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    @Transactional
    public List<Employee> getAllEmployeeList() {
        return employeeRepository.findAll();
    }

    @Override
    @Transactional
    public Optional<Employee> findEmployeeById(int employeeId) {
        return employeeRepository.findById(employeeId);
    }

    @Override
    @Transactional
    public void deleteEmployeeById(int employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
