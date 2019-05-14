package za.ac.cput.domain;

import java.util.Objects;

public class Customer {

    private String name;
    private int contact;
    private boolean active;

    private Customer() {
    }

    private Customer(Builder builder) {
        this.name = builder.name;
        this.contact = builder.contact;
        this.active = builder.active;
    }

    public String getName() {
        return name;
    }

    public int getContact() {
        return contact;
    }
    public boolean getActive() {
        return active;
    }


    public static class Builder {
        private String name;
        private int contact;
        private boolean active;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder contact(int contact) {
            this.contact = contact;
            return this;
        }
        public Builder active(boolean active) {
            this.active = active;
            return this;
        }

        public Builder copy(Customer customer) {
            this.name = customer.name;
            this.contact = customer.contact;
            this.active = customer.active;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", active='" + active + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return  Integer.toString(contact).equals(customer.contact);
    }

    @Override
    public int hashCode() {

        return Objects.hash(contact);
    }

}
