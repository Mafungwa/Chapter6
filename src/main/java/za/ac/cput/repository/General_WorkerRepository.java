package za.ac.cput.repository;

import za.ac.cput.domain.General_Worker;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface General_WorkerRepository extends IRespository<General_Worker,String> {
    Set<General_Worker> getAll();

}
