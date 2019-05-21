package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Customer;
import za.ac.cput.repository.CustomerRepository;

import java.util.HashSet;
import java.util.Set;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static CustomerRepositoryImpl repository = null;
    private Set<Customer> customers;

    private CustomerRepositoryImpl(){
        this.customers = new HashSet<>();

    }
    public static CustomerRepository getRepository(){
        if(repository == null) repository = new CustomerRepositoryImpl();
        return repository;
    }
    public Set<Customer> getAll() {
        return null;
    }
    public Customer create(Customer customer) {
        return null;
    }
    public Customer update(Customer customer) {
        return null;
    }
    public void delete(String s) {

    }
    public Customer read(String s) {
        return null;
    }
}
