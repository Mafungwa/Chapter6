package za.ac.cput.repository;

import za.ac.cput.domain.Order_State;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface Order_StateRepository extends IRespository<Order_State,String> {
    Set<Order_State> getAll();

}
