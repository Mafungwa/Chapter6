package za.ac.cput.factory;

import za.ac.cput.domain.Check;
import za.ac.cput.util.Misc;

public class CheckFactory {
    public static Check getCheck(String bankIdF, String nameF){
        return new Check.Builder()
                .bankId(bankIdF)
                .name(nameF)
                .bankId(Misc.generateId())
                .build();
    }
}
