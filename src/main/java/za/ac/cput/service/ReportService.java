package za.ac.cput.service;

import za.ac.cput.domain.Report;
import za.ac.cput.service.IService;

import java.util.Set;

public interface ReportService extends IService<Report,String>{
    Set<Report> getAll();
}
