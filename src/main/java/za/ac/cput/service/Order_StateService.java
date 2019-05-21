package za.ac.cput.service;

import za.ac.cput.domain.Order_State;
import za.ac.cput.service.IService;

import java.util.Set;

public interface Order_StateService extends IService<Order_State,String>{
    Set<Order_State> getAll();
}
