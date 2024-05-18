/*
Likhaya Kalimashe
240329171
Group10
*
* */

package za.ac.cput.domain;

import java.util.Objects;

public class Product {
    private final Long productId;
    private final String name;
    private final double price;
    private final String description;
    private final Brand brand;

    private Product(Builder builder) {
        this.productId = builder.productId;
        this.name = builder.name;
        this.price = builder.price;
        this.description = builder.description;
        this.brand = builder.brand;
    }

    public Brand getBrand() {
        return brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(productId, product.productId) &&
                Objects.equals(name, product.name) &&
                Objects.equals(description, product.description) &&
                Objects.equals(brand, product.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, name, price, description, brand);
    }

    public static class Builder {
        private final Long productId;
        private final String name;
        private double price;
        private String description;
        private Brand brand;

        public Builder(Long productId, String name) {
            this.productId = productId;
            this.name = name;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder brand(Brand brand) {
            this.brand = brand;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
