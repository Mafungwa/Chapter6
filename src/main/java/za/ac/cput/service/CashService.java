package za.ac.cput.service;

import za.ac.cput.domain.Cash;
import za.ac.cput.service.IService;

import java.util.Set;

public interface CashService extends IService<Cash,String>{
    Set<Cash> getAll();
}
