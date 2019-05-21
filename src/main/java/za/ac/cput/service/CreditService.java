package za.ac.cput.service;

import za.ac.cput.domain.Credit;
import za.ac.cput.service.IService;

import java.util.Set;

public interface CreditService extends IService<Credit,String>{
    Set<Credit> getAll();
}
