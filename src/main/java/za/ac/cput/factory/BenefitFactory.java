package za.ac.cput.factory;

import za.ac.cput.domain.Benefit;
import za.ac.cput.util.Misc;

public class BenefitFactory {
    public static Benefit getBenefit(double healthInsuranceF,double lifeInsuranceF){
        return new Benefit.Builder()
                .healthInsurance(healthInsuranceF)
                .lifeInsurance(lifeInsuranceF)
                .build();
    }
}
