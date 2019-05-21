package za.ac.cput.service;

import za.ac.cput.domain.Manager;
import za.ac.cput.service.IService;

import java.util.Set;

public interface ManagerService extends IService<Manager,String>{
    Set<Manager> getAll();
}
