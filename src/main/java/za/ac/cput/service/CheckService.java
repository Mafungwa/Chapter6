package za.ac.cput.service;

import za.ac.cput.domain.Check;
import za.ac.cput.service.IService;

import java.util.Set;

public interface CheckService extends IService<Check,String>{
    Set<Check> getAll();
}
