package za.ac.cput.domain;

import java.util.Objects;

public class Cash {

    private Double cashTendered;


    private Cash() {
    }

    private Cash(Builder builder) {
        this.cashTendered = builder.cashTendered;
    }

    public double getCashTendered() {
        return cashTendered;
    }

    public static class Builder {
        private double cashTendered;

        public Builder cashTendered(double cashTendered) {
            this.cashTendered = cashTendered;
            return this;
        }

        public Builder copy(Cash cash) {
            this.cashTendered = cash.cashTendered;
            return this;
        }

        public Cash build() {
            return new Cash(this);
        }
    }


    @Override
    public String toString() {
        return "Cash{" +
                "cashTendered='" + cashTendered + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cash cash = (Cash) o;
        return cashTendered.equals(cash.cashTendered);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cashTendered);
    }

}
