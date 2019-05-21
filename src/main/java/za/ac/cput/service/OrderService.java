package za.ac.cput.service;

import za.ac.cput.domain.Order;
import za.ac.cput.service.IService;

import java.util.Set;

public interface OrderService extends IService<Order,String>{
    Set<Order> getAll();
}
