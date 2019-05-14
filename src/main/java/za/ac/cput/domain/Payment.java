package za.ac.cput.domain;

import java.util.Objects;

public class Payment {
    private double amount;

    public Payment() {
    }

    public Payment(Builder builder) {
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

        public Builder copy(Payment payment){
            this.amount = payment.amount;
            return this;
        }
        public Payment build(){return new Payment(this);}
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Double.toString(amount).equals(payment.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

}
