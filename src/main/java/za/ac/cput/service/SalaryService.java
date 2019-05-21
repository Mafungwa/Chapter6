package za.ac.cput.service;

import za.ac.cput.domain.Salary;
import za.ac.cput.service.IService;

import java.util.Set;

public interface SalaryService extends IService<Salary,String>{
    Set<Salary> getAll();
}
