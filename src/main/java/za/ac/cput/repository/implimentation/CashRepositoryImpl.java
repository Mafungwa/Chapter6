package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Cash;
import za.ac.cput.repository.CashRepository;

import java.util.HashSet;
import java.util.Set;

public class CashRepositoryImpl implements CashRepository {

    private static CashRepositoryImpl repository = null;
    private Set<Cash> cash;

    private CashRepositoryImpl(){
        this.cash = new HashSet<>();

    }
    public static CashRepository getRepository(){
        if(repository == null) repository = new CashRepositoryImpl();
        return repository;
    }


    public Set<Cash> getAll() {
        return null;
    }
    public Cash create(Cash cash) {
        return null;
    }
    public Cash update(Cash cash) {
        return null;
    }
    public void delete(String s) {

    }
    public Cash read(String s) {
        return null;
    }
}
