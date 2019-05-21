package za.ac.cput.repository;

import za.ac.cput.domain.Manager;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface ManagerRepository extends IRespository<Manager,String> {
    Set<Manager> getAll();

}
