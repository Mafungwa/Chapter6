package za.ac.cput.factory;

import za.ac.cput.domain.Item;
import za.ac.cput.util.Misc;

public class ItemFactory {
    public static Item getItem(String idF,String orderIdF,int sizeF,String stockIdF){
        return new Item.Builder()
                .id(idF)
                .orderId(orderIdF)
                .size(sizeF)
                .stockId(stockIdF)
                .stockId(Misc.generateId())
                .build();
    }
}
