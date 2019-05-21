package za.ac.cput.domain;

import java.util.Objects;

import  org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan

public class Address {
    private String deliveryAddress;
    private String postalcode;

    private Address() {
    }

    private Address(Builder builder) {
        this.deliveryAddress = builder.deliveryAddress;
        this.postalcode = builder.postalcode;


    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getPostalcode() {
        return postalcode;
    }


    public static class Builder {
        private String postalcode;
        private String deliveryAddress;

        public Builder deliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        public Builder postalcode(String postalcode) {
            this.postalcode = postalcode;
            return this;
        }


        public Builder copy(Address address) {
            this.deliveryAddress = address.deliveryAddress;
            this.postalcode = address.postalcode;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }


    @Override
    public String toString() {
        return "Address{" +
                "deliveryAddress='" + deliveryAddress + '\'' +
                ", postalcode='" + postalcode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return postalcode.equals(address.postalcode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(postalcode);
    }

}
