package za.ac.cput.service;

import za.ac.cput.domain.Benefit;
import za.ac.cput.service.IService;

import java.util.Set;

public interface BenefitService extends IService<Benefit,String>{
    Set<Benefit> getAll();
}
