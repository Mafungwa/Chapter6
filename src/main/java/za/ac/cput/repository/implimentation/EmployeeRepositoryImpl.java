package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Employee;
import za.ac.cput.repository.EmployeeRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    private Set<Employee> employees;

    private EmployeeRepositoryImpl(){
        this.employees = new HashSet<>();

    }
    public static EmployeeRepository getRepository(){
        if(repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }

    public Set<Employee> getAll() {
        return null;
    }

    public Employee create(Employee employee) {
        return null;
    }

    public Employee update(Employee employee) {
        return null;
    }

    public void delete(String s) {

    }

    public Employee read(String s) {
        return null;
    }
}
