package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Benefit;
import za.ac.cput.repository.BenefitRepository;

import java.util.HashSet;
import java.util.Set;

public class BenefitRepositoryImpl implements BenefitRepository {

    private static BenefitRepositoryImpl repository = null;
    private Set<Benefit> benefits;

    private BenefitRepositoryImpl(){
        this.benefits = new HashSet<>();

    }
    public static BenefitRepository getRepository(){
        if (repository == null) repository = new BenefitRepositoryImpl();
        return repository;
    }


    public Set<Benefit> getAll() {
        return null;
    }
    public Benefit create(Benefit benefit) {
        return null;
    }
    public Benefit update(Benefit benefit) {
        return null;
    }
    public void delete(String s) {

    }
    public Benefit read(String s) {
        return null;
    }
}
