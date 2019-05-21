package za.ac.cput.service;

import za.ac.cput.domain.Customer;
import za.ac.cput.service.IService;

import java.util.Set;

public interface CustomerService extends IService<Customer,String>{
    Set<Customer> getAll();
}
