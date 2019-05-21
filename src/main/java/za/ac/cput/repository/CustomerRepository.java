package za.ac.cput.repository;

import za.ac.cput.domain.Customer;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface CustomerRepository extends IRespository<Customer,String> {
    Set<Customer> getAll();

}
