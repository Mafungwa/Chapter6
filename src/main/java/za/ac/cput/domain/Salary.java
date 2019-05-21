package za.ac.cput.domain;

import java.util.Objects;

import  org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan

public class Salary {
    private double amount;

    public Salary() {
    }

    public Salary(Builder builder) {
        this.amount = builder.amount;
    }

    public double getAmount() {
        return amount;
    }
    public static class Builder{
        private double amount;

        public Builder amount(double amount) {
            this.amount = amount;
            return this;
        }
        public Builder copy(Salary salary){
            this.amount = salary.amount;
            return this;
        }
        public Salary build(){return new Salary(this);}
    }

    @Override
    public String toString() {
        return "Salary{" +
                "amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salary salary = (Salary) o;
        return Double.toString(amount).equals(salary.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
