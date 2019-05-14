package za.ac.cput.domain;

import java.util.Objects;

public class Check {

    private String name;
    private String bankId;


    private Check() {
    }

    private Check(Builder builder) {
        this.name = builder.name;
        this.bankId = builder.bankId;
    }

    public String getName() {
        return name;
    }
    public String getBankId() {
        return bankId;
    }

    public static class Builder {
        private String name;
        private String bankId;

        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder bankId(String bankId) {
            this.bankId = bankId;
            return this;
        }

        public Builder copy(Check check) {
            this.name = check.name;
            this.bankId = check.bankId;
            return this;
        }

        public Check build() {
            return new Check(this);
        }
    }


    @Override
    public String toString() {
        return "Check{" +
                "name='" + name + '\'' +
                "bankId='" + bankId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Check check = (Check) o;
        return bankId.equals(check.bankId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bankId);
    }

}
