package za.ac.cput.repository;

import za.ac.cput.domain.Order;
import za.ac.cput.repository.IRespository;

import java.util.Set;

public interface OrderRepository extends IRespository<Order,String> {
    Set<Order> getAll();

}
