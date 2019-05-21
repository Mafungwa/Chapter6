package za.ac.cput.factory;

import za.ac.cput.domain.Salary;
import za.ac.cput.util.Misc;

public class SalaryFactory {
    public static Salary getSalary(double amountF){
        return new Salary.Builder()
                .amount(amountF)
                .build();
    }
}
