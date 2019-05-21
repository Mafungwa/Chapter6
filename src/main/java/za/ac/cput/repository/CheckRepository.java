package za.ac.cput.repository;

import za.ac.cput.domain.Check;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface CheckRepository extends IRespository<Check,String> {
    Set<Check> getAll();

}
