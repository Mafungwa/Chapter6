package za.ac.cput.factory;

import za.ac.cput.domain.General_Worker;
import za.ac.cput.util.Misc;

public class General_WorkerFactory {
    public static General_Worker getGeneral_Worker(String empNumF){
        return new General_Worker.Builder()
                .empNum(empNumF)
                .empNum(Misc.generateId())
                .build();
    }
}
