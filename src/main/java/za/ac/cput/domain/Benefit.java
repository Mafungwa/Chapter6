package za.ac.cput.domain;

import java.util.Objects;

import  org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan

public class Benefit {

    private Double healthInsurance;
    private Double lifeInsurance;

    private Benefit() {
    }

    private Benefit(Builder builder) {
        this.healthInsurance = builder.healthInsurance;
        this.lifeInsurance = builder.lifeInsurance;


    }

    public double getHealthInsurance() {
        return healthInsurance;
    }

    public double getLifeInsurance() {
        return lifeInsurance;
    }


    public static class Builder {
        private double healthInsurance;
        private double lifeInsurance;

        public Builder healthInsurance(double healthInsurance) {
            this.healthInsurance = healthInsurance;
            return this;
        }

        public Builder lifeInsurance(double lifeInsurance) {
            this.lifeInsurance = lifeInsurance;
            return this;
        }


        public Builder copy(Benefit benefit) {
            this.healthInsurance = benefit.healthInsurance;
            this.lifeInsurance = benefit.lifeInsurance;
            return this;
        }

        public Benefit build() {
            return new Benefit(this);
        }
    }


    @Override
    public String toString() {
        return "Benefit{" +
                "healthInsurance='" + healthInsurance + '\'' +
                ", lifeInsurance='" + lifeInsurance + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Benefit benefit = (Benefit) o;
        return healthInsurance.equals(benefit.healthInsurance);
    }

    @Override
    public int hashCode() {

        return Objects.hash(healthInsurance);
    }

}
