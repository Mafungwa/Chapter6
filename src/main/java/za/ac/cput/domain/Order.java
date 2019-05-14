package za.ac.cput.domain;

import java.util.Date;
import java.util.Objects;

public class Order {

private Date createDate;

    public Order() {
    }

    public Order(Builder builder) {
        this.createDate = builder.createDate;
    }

    public Date getCreateDate() {
        return createDate;
    }
    public static class Builder{
        private Date createDate;

        public Builder createDate(Date createDate) {
            this.createDate = createDate;
            return this;
        }

        public Builder copy(Order order){
            this.createDate = order.createDate;
            return this;
        }
        public Order build(){return new Order(this);}
    }

    @Override
    public String toString() {
        return "Order{" +
                "createDate=" + createDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return createDate.equals(order.createDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createDate);
    }
}
