package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Supplier;
import za.ac.cput.repository.SupplierRepository;

import java.util.HashSet;
import java.util.Set;

public class SupplierRepositoryImpl implements SupplierRepository {

    private static SupplierRepositoryImpl repository = null;
    private Set<Supplier> suppliers;

    private SupplierRepositoryImpl(){
        this.suppliers = new HashSet<>();

    }
    public static SupplierRepository getRepository(){
        if(repository == null) repository = new SupplierRepositoryImpl();
        return repository;
    }

    public Set<Supplier> getAll() {
        return null;
    }

    public Supplier create(Supplier supplier) {
        return null;
    }

    public Supplier update(Supplier supplier) {
        return null;
    }

    public void delete(String s) {

    }

    public Supplier read(String s) {
        return null;
    }
}
