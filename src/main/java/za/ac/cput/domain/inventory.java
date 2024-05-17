/***
 * inventory.java
 * Author: Anathi Mhlom(220006695)
 * 17 May 2024
 */
package za.ac.cput.domain;

import java.util.Objects;

public class inventory {
    private Long productId;
    private double quantityInStock;
    private double reorderLevel;
    private supplierDetails supplierDetails;

    // Constructor
    private inventory() {

    }

    private inventory(Builder builder) {
        this.productId = builder.productId;
        this.quantityInStock = builder.quantityInStock;
        this.reorderLevel = builder.reorderLevel;
        this.supplierDetails = builder.supplierDetails;
    }

    // Getters
    public Long getProductId() {
        return productId;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public double getReorderLevel() {
        return reorderLevel;
    }

    public supplierDetails getSupplierDetails() {
        return supplierDetails;
    }

    // Builder class
    public static class Builder {
        private final Long productId;
        private final double quantityInStock;
        private final double reorderLevel;
        private final supplierDetails supplierDetails;

        public Builder(Long productId, double quantityInStock, double reorderLevel, supplierDetails supplierDetails) {
            this.productId = productId;
            this.quantityInStock = quantityInStock;
            this.reorderLevel = reorderLevel;
            this.supplierDetails = supplierDetails;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return Double.compare(quantityInStock, builder.quantityInStock) == 0 && Double.compare(reorderLevel, builder.reorderLevel) == 0 && Objects.equals(productId, builder.productId) && Objects.equals(supplierDetails, builder.supplierDetails);
        }

        @Override
        public int hashCode() {
            return Objects.hash(productId, quantityInStock, reorderLevel, supplierDetails);
        }

        public inventory build() {
            inventory inventory = new inventory();
            inventory.productId = this.productId;
            inventory.quantityInStock = this.quantityInStock;
            inventory.reorderLevel = this.reorderLevel;
            inventory.supplierDetails = this.supplierDetails;
            return new inventory(this);
        }

        @Override
        public String toString() {
            return "Inventory{" +
                    "productId=" + productId +
                    ", quantityInStock=" + quantityInStock +
                    ", reorderLevel=" + reorderLevel +
                    ", supplierDetails=" + supplierDetails +
                    '}';
        }
    }
}
