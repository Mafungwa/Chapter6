package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Check;
import za.ac.cput.repository.CheckRepository;

import java.util.HashSet;
import java.util.Set;

public class CheckRepositoryImpl implements CheckRepository {

    private static CheckRepositoryImpl repository = null;
    private Set<Check> checks;

    private CheckRepositoryImpl(){
        this.checks = new HashSet<>();

    }
    public static CheckRepository getRepository(){
        if(repository == null) repository = new CheckRepositoryImpl();
        return repository;
    }
    public Set<Check> getAll() {
        return null;
    }
    public Check create(Check check) {
        return null;
    }
    public Check update(Check check) {
        return null;
    }
    public void delete(String s) {

    }
    public Check read(String s) {
        return null;
    }
}
