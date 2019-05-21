package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Credit;
import za.ac.cput.repository.CreditRepository;

import java.util.HashSet;
import java.util.Set;

public class CreditRepositoryImpl implements CreditRepository {

    private static CreditRepositoryImpl repository = null;
    private Set<Credit> credits;

    private CreditRepositoryImpl(){
        this.credits = new HashSet<>();

    }
    public static CreditRepository getRepository(){
        if(repository == null) repository = new CreditRepositoryImpl();
        return repository;
    }

    public Set<Credit> getAll() {
        return null;
    }
    public Credit create(Credit credit) {
        return null;
    }
    public Credit update(Credit credit) {
        return null;
    }
    public void delete(String s) {

    }
    public Credit read(String s) {
        return null;
    }
}
