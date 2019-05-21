package za.ac.cput.factory;

import za.ac.cput.domain.Account;
import za.ac.cput.util.Misc;

public class AccountFactory {
    public static Account getAccount(String empIdF){
        return new Account.Builder().empId(Misc.generateId())
                .empId(empIdF)
                .build();
    }
}
