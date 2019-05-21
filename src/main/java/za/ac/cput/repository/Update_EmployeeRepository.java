package za.ac.cput.repository;

import za.ac.cput.domain.Update_Employee;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface Update_EmployeeRepository extends IRespository<Update_Employee,String> {
    Set<Update_Employee> getAll();

}
