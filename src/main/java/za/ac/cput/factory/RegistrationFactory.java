package za.ac.cput.factory;

import za.ac.cput.domain.Registration;
import za.ac.cput.util.Misc;

public class RegistrationFactory {
    public static Registration getRegistration(String empIdF,String fullnameF,String passwordF,String usernameF){
        return new Registration.Builder()
                .empId(empIdF)
                .fullname(fullnameF)
                .password(passwordF)
                .username(usernameF)
                .empId(Misc.generateId())
                .build();
    }
}
