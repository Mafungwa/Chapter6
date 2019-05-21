package za.ac.cput.repository;

import za.ac.cput.domain.Job_History;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface Job_HistoryRepository extends IRespository<Job_History,String> {
    Set<Job_History> getAll();

}
