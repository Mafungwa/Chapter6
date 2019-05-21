package za.ac.cput.factory;

import za.ac.cput.domain.Payment;
import za.ac.cput.util.Misc;

public class PaymentFactory {
    public static Payment getPayment(double amountF){
        return new Payment.Builder()
                .amount(amountF)
                .build();
    }
}
