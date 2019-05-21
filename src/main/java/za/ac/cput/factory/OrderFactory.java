package za.ac.cput.factory;

import za.ac.cput.domain.Order;
import za.ac.cput.util.Misc;

import java.util.Date;

public class OrderFactory {
    public static Order getOrder(Date createDateF){
        return new Order.Builder()
                .createDate(createDateF)
                .build();
    }
}
