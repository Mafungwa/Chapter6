package za.ac.cput.factory;

import za.ac.cput.domain.Update_Employee;
import za.ac.cput.util.Misc;

public class Update_EmployeeFactory {
    public static Update_Employee getUpdate_Employee(String addressF,String empIdF,boolean genderF,int idNumF,String nameF,String surnameF){
        return new Update_Employee.Builder()
                .address(addressF)
                .empId(empIdF)
                .gender(genderF)
                .idNum(idNumF)
                .name(nameF)
                .surname(surnameF)
                .empId(Misc.generateId())
                .build();
    }
}
