package za.ac.cput.repository;

import za.ac.cput.domain.Cash;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface CashRepository extends IRespository<Cash,String> {
    Set<Cash> getAll();

}
