package za.ac.cput.repository;

import za.ac.cput.domain.Supplier;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface SupplierRepository extends IRespository<Supplier,String> {
    Set<Supplier> getAll();

}
