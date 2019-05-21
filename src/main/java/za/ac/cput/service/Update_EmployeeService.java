package za.ac.cput.service;

import za.ac.cput.domain.Update_Employee;
import za.ac.cput.service.IService;

import java.util.Set;

public interface Update_EmployeeService extends IService<Update_Employee,String>{
    Set<Update_Employee> getAll();
}
