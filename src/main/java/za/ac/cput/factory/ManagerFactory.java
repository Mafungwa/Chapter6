package za.ac.cput.factory;

import za.ac.cput.domain.Manager;
import za.ac.cput.util.Misc;

public class ManagerFactory {
    public static Manager getManager(String empNumF){
        return new Manager.Builder()
                .empNum(empNumF)
                .empNum(Misc.generateId())
                .build();
    }
}
