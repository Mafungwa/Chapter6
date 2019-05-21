package za.ac.cput.factory;

import za.ac.cput.domain.Cash;
import za.ac.cput.util.Misc;

public class CashFactory {
    public static Cash getCash(double cashTenderedF){
        return new Cash.Builder()
                .cashTendered(cashTenderedF)
                .build();
    }
}
