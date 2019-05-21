package za.ac.cput.repository;

import za.ac.cput.domain.Report;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface ReportRepository extends IRespository<Report,String> {
    Set<Report> getAll();

}
