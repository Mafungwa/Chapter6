package za.ac.cput.repository;

import za.ac.cput.domain.Credit;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface CreditRepository extends IRespository<Credit,String> {
    Set<Credit> getAll();

}
