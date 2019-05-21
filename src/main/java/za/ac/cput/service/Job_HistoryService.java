package za.ac.cput.service;

import za.ac.cput.domain.Job_History;
import za.ac.cput.service.IService;

import java.util.Set;

public interface Job_HistoryService extends IService<Job_History,String>{
    Set<Job_History> getAll();
}
