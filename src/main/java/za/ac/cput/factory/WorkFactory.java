package za.ac.cput.factory;

import za.ac.cput.domain.Work;
import za.ac.cput.util.Misc;

public class WorkFactory {
    public static Work getWork(String departmentF,int employeeNumF,int holidayRemainingF,int hoursWorkedF,double paymentF,String positionF,int rateOfPayF){
        return new Work.Builder()
                .department(departmentF)
                .employeeNum(employeeNumF)
                .holidayRemaining(holidayRemainingF)
                .hoursWorked(hoursWorkedF)
                .payment(paymentF)
                .position(positionF)
                .rateOfPay(rateOfPayF)
                .position(Misc.generateId())
                .build();
    }
}
