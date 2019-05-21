package za.ac.cput.factory;

import za.ac.cput.domain.Credit;
import za.ac.cput.util.Misc;

import java.util.Date;

public class CreditFactory {
    public static Credit getCredit(Date expireDateF, String numberF, String typeF){
        return new Credit.Builder()
                .expireDate(expireDateF)
                .number(numberF)
                .type(typeF)
                .number(Misc.generateId())
                .build();
    }
}
