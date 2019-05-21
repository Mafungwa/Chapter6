package za.ac.cput.repository;

import za.ac.cput.domain.Admin;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface AdminRepository extends IRespository<Admin,String> {
    Set<Admin> getAll();

}
