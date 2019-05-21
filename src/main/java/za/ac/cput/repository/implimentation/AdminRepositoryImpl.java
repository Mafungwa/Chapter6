package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Admin;
import za.ac.cput.repository.AdminRepository;

import java.util.HashSet;
import java.util.Set;

public class AdminRepositoryImpl implements AdminRepository {

    private static AdminRepositoryImpl repository = null;
    private Set<Admin> admins;

    private AdminRepositoryImpl(){
        this.admins = new HashSet<>();
    }
    public static AdminRepository getRepository(){
        if (repository == null) repository = new AdminRepositoryImpl();
        return repository;
    }

    public Set<Admin> getAll() {
        return null;
    }


    public Admin create(Admin admin) {
        return null;
    }


    public Admin update(Admin admin) {
        return null;
    }


    public void delete(String s) {

    }


    public Admin read(String s) {
        return null;
    }
}
