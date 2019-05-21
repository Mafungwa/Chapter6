package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Address;
import za.ac.cput.repository.AddressRespository;

import java.util.HashSet;
import java.util.Set;

public class AddressRepositoryImpl implements AddressRespository {

    private static AddressRepositoryImpl repository = null;
    private Set<Address> addresses;

    private AddressRepositoryImpl(){
        this.addresses = new HashSet<>();

    }
    public static AddressRespository getRepository(){
        if(repository == null) repository = new AddressRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Address> getAll() {
        return null;
    }

    @Override
    public Address create(Address address) {
        return null;
    }

    @Override
    public Address update(Address address) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Address read(String s) {
        return null;
    }
}
