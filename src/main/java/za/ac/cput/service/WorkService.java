package za.ac.cput.service;


import za.ac.cput.domain.Work;
import za.ac.cput.service.IService;

import java.util.Set;

public interface WorkService extends IService<Work,String>{
    Set<Work> getAll();
}
