package za.ac.cput.repository;

import za.ac.cput.domain.Employee;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface EmployeeRepository extends IRespository<Employee,String> {
    Set<Employee> getAll();

}
