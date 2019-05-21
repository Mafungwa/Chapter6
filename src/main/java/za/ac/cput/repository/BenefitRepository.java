package za.ac.cput.repository;

import za.ac.cput.domain.Benefit;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface BenefitRepository extends IRespository<Benefit,String> {
    Set<Benefit> getAll();

}
