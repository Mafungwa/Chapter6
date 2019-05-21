package za.ac.cput.factory;

import za.ac.cput.domain.Login;
import za.ac.cput.util.Misc;

public class LoginFactory {
    public static Login getLogin(String usernameF,String passwordF){
        return new Login.Builder()
                .password(passwordF)
                .username(usernameF)
                .username(Misc.generateId())
                .build();
    }
}
