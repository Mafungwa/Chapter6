package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Update_Employee;
import za.ac.cput.repository.Update_EmployeeRepository;

import java.util.HashSet;
import java.util.Set;

public class Update_EmployeeRepositoryImpl implements Update_EmployeeRepository {

    private static Update_EmployeeRepositoryImpl repository = null;
    private Set<Update_Employee> update_employees;

    private Update_EmployeeRepositoryImpl(){
        this.update_employees = new HashSet<>();

    }
    public static Update_EmployeeRepository getRepository(){
        if(repository == null) repository = new Update_EmployeeRepositoryImpl();
        return repository;
    }

    public Set<Update_Employee> getAll() {
        return null;
    }

    public Update_Employee create(Update_Employee update_employee) {
        return null;
    }

    public Update_Employee update(Update_Employee update_employee) {
        return null;
    }

    public void delete(String s) {

    }

    public Update_Employee read(String s) {
        return null;
    }
}
