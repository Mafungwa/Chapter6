package za.ac.cput.repository;

import za.ac.cput.domain.Salary;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface SalaryRepository extends IRespository<Salary,String> {
    Set<Salary> getAll();

}
