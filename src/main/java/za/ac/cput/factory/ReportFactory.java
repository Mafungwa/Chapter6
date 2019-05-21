package za.ac.cput.factory;

import za.ac.cput.domain.Report;
import za.ac.cput.util.Misc;

public class ReportFactory {
    public static Report getReport(String filepathF,String typeF){
        return new Report.Builder()
                .filepath(filepathF)
                .type(typeF)
                .filepath(Misc.generateId())
                .build();
    }
}
