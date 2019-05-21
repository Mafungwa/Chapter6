package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Salary;
import za.ac.cput.repository.SalaryRepository;

import java.util.HashSet;
import java.util.Set;

public class SalaryRepositoryImpl implements SalaryRepository {

    private static SalaryRepositoryImpl repository = null;
    private Set<Salary> salaries;

    private SalaryRepositoryImpl(){
        this.salaries = new HashSet<>();

    }
    public static SalaryRepository getRepository(){
        if(repository == null) repository = new SalaryRepositoryImpl();
        return repository;
    }

    public Set<Salary> getAll() {
        return null;
    }

    public Salary create(Salary salary) {
        return null;
    }

    public Salary update(Salary salary) {
        return null;
    }

    public void delete(String s) {

    }

    public Salary read(String s) {
        return null;
    }
}
