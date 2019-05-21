package za.ac.cput.factory;

import za.ac.cput.domain.Employee;
import za.ac.cput.util.Misc;

public class EmployeeFactory {
    public static Employee getEmployee(String addressF,String emailF,String genderF,int idF,int mobileNumberF,String nameF,String roleF,String surnameF){
        return new Employee.Builder()
                .address(addressF)
                .email(emailF)
                .gender(genderF)
                .id(idF)
                .mobileNumber(mobileNumberF)
                .name(nameF)
                .role(roleF)
                .surname(surnameF)
                .surname(Misc.generateId())
                .build();


    }
}
