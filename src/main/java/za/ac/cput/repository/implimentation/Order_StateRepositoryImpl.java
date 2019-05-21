package za.ac.cput.repository.implimentation;

import za.ac.cput.domain.Order_State;
import za.ac.cput.repository.Order_StateRepository;

import java.util.HashSet;
import java.util.Set;

public class Order_StateRepositoryImpl implements Order_StateRepository {

    private static Order_StateRepositoryImpl repository = null;
    private Set<Order_State> order_states;

    private Order_StateRepositoryImpl(){
        this.order_states = new HashSet<>();

    }
    public static Order_StateRepository getRepository(){
        if(repository == null) repository = new Order_StateRepositoryImpl();
        return repository;
    }

    public Set<Order_State> getAll() {
        return null;
    }

    public Order_State create(Order_State order_state) {
        return null;
    }

    public Order_State update(Order_State order_state) {
        return null;
    }

    public void delete(String s) {

    }

    public Order_State read(String s) {
        return null;
    }
}
