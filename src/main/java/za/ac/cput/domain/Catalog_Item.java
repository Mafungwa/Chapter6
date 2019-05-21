package za.ac.cput.domain;

import java.util.Objects;

import  org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan

public class Catalog_Item {

    private int qty;
    private String taxStatus;


    private Catalog_Item() {
    }

    private Catalog_Item(Builder builder) {
        this.qty = builder.qty;
        this.taxStatus = builder.taxStatus;
    }

    public int getQty() {
        return qty;
    }
    public String getTaxStatus() {
        return taxStatus;
    }

    public static class Builder {
        private int qty;
        private String taxStatus;

        public Builder qty(int qty) {
            this.qty = qty;
            return this;
        }
        public Builder taxStatus(String taxStatus) {
            this.taxStatus = taxStatus;
            return this;
        }

        public Builder copy(Catalog_Item catalog_item) {
            this.qty = catalog_item.qty;
            this.taxStatus = catalog_item.taxStatus;
            return this;
        }

        public Catalog_Item build() {
            return new Catalog_Item(this);
        }
    }


    @Override
    public String toString() {
        return "Catalog_Item{" +
                "qty='" + qty + '\'' +
                "taxStatus='" + taxStatus + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Catalog_Item catalog_item = (Catalog_Item) o;
        return Integer.toString(qty).equals(catalog_item.qty);
    }

    @Override
    public int hashCode() {

        return Objects.hash(qty);
    }

}
