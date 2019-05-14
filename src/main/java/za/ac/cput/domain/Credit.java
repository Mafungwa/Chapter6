package za.ac.cput.domain;

import java.util.Date;
import java.util.Objects;

public class Credit {

    private String number;
    private String type;
    private Date expireDate;

    private Credit() {
    }

    private Credit(Builder builder) {
        this.number = builder.number;
        this.type = builder.type;
        this.expireDate = builder.expireDate;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }
    public Date getExpireDate() {
        return expireDate;
    }


    public static class Builder {
        private String number;
        private String type;
        private Date expireDate;

        public Builder number(String number) {
            this.number = number;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }
        public Builder expireDate(Date expireDate) {
            this.expireDate = expireDate;
            return this;
        }

        public Builder copy(Credit credit) {
            this.number = credit.number;
            this.type = credit.type;
            this.expireDate = credit.expireDate;
            return this;
        }

        public Credit build() {
            return new Credit(this);
        }
    }


    @Override
    public String toString() {
        return "Credit{" +
                "number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", expireDate='" + expireDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Credit credit = (Credit) o;
        return number.equals(credit.number);
    }

    @Override
    public int hashCode() {

        return Objects.hash(number);
    }

}
