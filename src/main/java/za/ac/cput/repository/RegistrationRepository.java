package za.ac.cput.repository;

import za.ac.cput.domain.Registration;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface RegistrationRepository extends IRespository<Registration,String> {
    Set<Registration> getAll();

}
