package za.ac.cput.factory;

import za.ac.cput.domain.Address;
import za.ac.cput.util.Misc;

public class AddressFactory {
    public static Address getAddress(String deliveryAddressF,String postalcodeF){
        return new Address.Builder()
                .deliveryAddress(deliveryAddressF)
                .postalcode(postalcodeF)
                .deliveryAddress(Misc.generateId())
                .build();
    }
}
