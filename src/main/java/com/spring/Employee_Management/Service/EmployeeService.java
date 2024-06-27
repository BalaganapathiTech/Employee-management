package com.spring.Employee_Management.Service;

import com.spring.Employee_Management.Entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<EmployeeEntity> getAllEmployees();
    Optional<EmployeeEntity> getEmployeeById(Long id);
    EmployeeEntity saveEmployee(EmployeeEntity employee);
    EmployeeEntity updateEmployee(Long id, EmployeeEntity employeeDetails);
    void deleteEmployee(Long id);
}
