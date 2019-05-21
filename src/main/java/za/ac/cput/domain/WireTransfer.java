package za.ac.cput.domain;

import java.util.Objects;

import  org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan

public class WireTransfer extends Payment{

    private String bankId,bankName;

    public WireTransfer() {
    }

    public WireTransfer(Builder builder) {
        this.bankId = builder.bankId;
        this.bankName = builder.bankName;
    }

    public String getBankId() {
        return bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public static class Builder{
        private String bankId,bankName;

        public Builder bankId(String bankId) {
            this.bankId = bankId;
            return this;
        }

        public Builder bankName(String bankName) {
            this.bankName = bankName;
            return this;
        }
        public WireTransfer build(){return new WireTransfer(this);}
    }

    @Override
    public String toString() {
        return "WireTransfer{" +
                "bankId='" + bankId + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WireTransfer wireTransfer = (WireTransfer) o;
        return bankId.equals(wireTransfer.bankId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankId);
    }
}
