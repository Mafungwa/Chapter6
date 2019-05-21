package za.ac.cput.service;

import za.ac.cput.domain.Employee;
import za.ac.cput.service.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee,String>{
    Set<Employee> getAll();
}
