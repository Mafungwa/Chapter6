package za.ac.cput.repository;

import za.ac.cput.domain.Login;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface LoginRepository extends IRespository<Login,String> {
    Set<Login> getAll();

}
