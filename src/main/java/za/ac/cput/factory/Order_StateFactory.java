package za.ac.cput.factory;

import za.ac.cput.domain.Order_State;
import za.ac.cput.util.Misc;

public class Order_StateFactory {
    public static Order_State getOrder_State(String createF,String deliveryF,double paidF){
        return new Order_State.Builder()
                .create(createF)
                .delivery(deliveryF)
                .paid(paidF)
                .create(Misc.generateId())
                .build();
    }
}
