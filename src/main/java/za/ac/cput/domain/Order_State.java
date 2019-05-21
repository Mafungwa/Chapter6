package za.ac.cput.domain;

import java.util.Objects;

import  org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan

public class Order_State {
    private String create;
    private String delivery;
    private double paid;

    public Order_State() {
    }
    public Order_State(Builder builder) {
        this.create = builder.create;
        this.delivery = builder.delivery;
        this.paid = builder.paid;
    }

    public String getCreate() {
        return create;
    }

    public String getDelivery() {
        return delivery;
    }

    public double getPaid() {
        return paid;
    }
    public static class Builder{
        private String create;
        private String delivery;
        private double paid;

        public Builder create(String create) {
            this.create = create;
            return this;
        }

        public Builder delivery(String delivery) {
            this.delivery = delivery;
            return this;
        }

        public Builder paid(double paid) {
            this.paid = paid;
            return this;
        }
        public Builder copy(Order_State order_state){
            this.create = order_state.create;
            this.delivery = order_state.delivery;
            this.paid = order_state.paid;
            return this;
        }
        public Order_State build(){
            return new Order_State(this);
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "create='" + create + '\'' +
                ", delivery='" + delivery + '\'' +
                ", paid=" + paid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order_State order_state = (Order_State) o;
        return create.equals(order_state.create);
    }

    @Override
    public int hashCode() {
        return Objects.hash(create);
    }
}
