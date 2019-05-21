package za.ac.cput.factory;

import za.ac.cput.domain.Admin;
import za.ac.cput.util.Misc;

public class AdminFactory {
    public static Admin getAdmin(String empNumF,String nameF,String qualificationF){
        return new Admin.Builder()
                .empNum(empNumF)
                //.name(nameF)
                .qualification(qualificationF)
                .empNum(Misc.generateId())
                .build();
    }
}
