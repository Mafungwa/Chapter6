package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Manager;
import za.ac.cput.repository.ManagerRepository;

import java.util.HashSet;
import java.util.Set;

public class ManagerRepositoryImpl implements ManagerRepository {

    private static ManagerRepositoryImpl repository = null;
    private Set<Manager> managers;

    private ManagerRepositoryImpl(){
        this.managers = new HashSet<>();

    }
    public static ManagerRepository getRepository(){
        if(repository == null) repository = new ManagerRepositoryImpl();
        return repository;
    }

    public Set<Manager> getAll() {
        return null;
    }

    public Manager create(Manager manager) {
        return null;
    }

    public Manager update(Manager manager) {
        return null;
    }

    public void delete(String s) {

    }

    public Manager read(String s) {
        return null;
    }
}
