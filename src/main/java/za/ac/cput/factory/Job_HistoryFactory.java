package za.ac.cput.factory;

import za.ac.cput.domain.Job_History;
import za.ac.cput.util.Misc;

import java.util.Date;

public class Job_HistoryFactory {
    public static Job_History getJob_History(String DepartmentIdF, String EmpIdF, Date EndDateF, Date StartDateF){
        return new Job_History.Builder()
                .DepartmentId(DepartmentIdF)
                .EmpId(EmpIdF)
                .EndDate(EndDateF)
                .StartDate(StartDateF)
                .EmpId(Misc.generateId())
                .build();
    }
}
