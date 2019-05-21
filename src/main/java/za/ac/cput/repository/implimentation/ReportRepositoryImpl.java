package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Report;
import za.ac.cput.repository.ReportRepository;

import java.util.HashSet;
import java.util.Set;

public class ReportRepositoryImpl implements ReportRepository {

    private static ReportRepositoryImpl repository = null;
    private Set<Report> reports;

    private ReportRepositoryImpl(){
        this.reports = new HashSet<>();

    }
    public static ReportRepository getRepository(){
        if(repository == null) repository = new ReportRepositoryImpl();
        return repository;
    }

    public Set<Report> getAll() {
        return null;
    }

    public Report create(Report report) {
        return null;
    }

    public Report update(Report report) {
        return null;
    }

    public void delete(String s) {

    }

    public Report read(String s) {
        return null;
    }
}
