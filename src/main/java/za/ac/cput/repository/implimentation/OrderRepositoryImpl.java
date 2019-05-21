package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Order;
import za.ac.cput.repository.OrderRepository;

import java.util.HashSet;
import java.util.Set;

public class OrderRepositoryImpl implements OrderRepository {

    private static OrderRepositoryImpl repository = null;
    private Set<Order> orders;

    private OrderRepositoryImpl(){
        this.orders = new HashSet<>();

    }
    public static OrderRepository getRepository(){
        if(repository == null) repository = new OrderRepositoryImpl();
        return repository;
    }

    public Set<Order> getAll() {
        return null;
    }

    public Order create(Order order) {
        return null;
    }

    public Order update(Order order) {
        return null;
    }

    public void delete(String s) {

    }

    public Order read(String s) {
        return null;
    }
}
