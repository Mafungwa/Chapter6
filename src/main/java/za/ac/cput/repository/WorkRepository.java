package za.ac.cput.repository;

import za.ac.cput.domain.Work;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface WorkRepository extends IRespository<Work,String> {
    Set<Work> getAll();

}
