package za.ac.cput.service;

import za.ac.cput.domain.Address;
import za.ac.cput.service.IService;


import java.util.Set;

public interface AddressService extends IService<Address, String>{
    Set<Address> getAll();
}
