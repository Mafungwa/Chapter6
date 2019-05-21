package za.ac.cput.repository;

import za.ac.cput.domain.Address;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface AddressRespository extends IRespository<Address,String> {
    Set<Address> getAll();

}
