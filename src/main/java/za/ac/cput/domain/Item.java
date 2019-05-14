package za.ac.cput.domain;

import java.util.Objects;

public class Item {

    private String id;
    private int size;
    private String stockId;
    private String orderId;

    private Item() {
    }

    private Item(Builder builder) {
        this.id = builder.id;
        this.size = builder.size;
        this.stockId = builder.stockId;
        this.orderId = builder.orderId;
    }

    public String getId() {
        return id;
    }
    public int getSize() {
        return size;
    }
    public String getStockId() {
        return stockId;
    }
    public String getOrderId() {
        return orderId;
    }


    public static class Builder {
        private String id;
        private int size;
        private String stockId;
        private String orderId;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder size(int size) {
            this.size = size;
            return this;
        }
        public Builder stockId(String stockId) {
            this.stockId = stockId;
            return this;
        }
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder copy(Item item) {
            this.id = item.id;
            this.size = item.size;
            this.stockId = item.stockId;
            this.orderId = item.orderId;
            return this;
        }

        public Item build() {
            return new Item(this);
        }
    }


    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", size='" + size + '\'' +
                ", stockId='" + stockId + '\'' +
                ", orderId='" + orderId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return  id.equals(item.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

}
