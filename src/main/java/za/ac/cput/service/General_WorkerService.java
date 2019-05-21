package za.ac.cput.service;

import za.ac.cput.domain.General_Worker;
import za.ac.cput.service.IService;

import java.util.Set;

public interface General_WorkerService extends IService<General_Worker,String>{
    Set<General_Worker> getAll();
}
