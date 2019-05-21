package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import za.ac.cput.util.Misc;

public class CustomerFactory {
    public static Customer getCustomer(boolean activeF, int contactF, String nameF){
        return new Customer.Builder()
                .active(activeF)
                .contact(contactF)
                .name(nameF)
                .name(Misc.generateId())
                .build();
    }
}
