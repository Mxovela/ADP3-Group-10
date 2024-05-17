/***
 * supplierDetails.java
 * Author: Anathi Mhlom(220006695)
 * 17 May 2024
 */
package za.ac.cput.domain;

import java.util.Objects;

public class supplierDetails {
    private String supplierName;
    private String supplierMobile;
    private String supplierEmail;

    // Constructor
    private supplierDetails() {

    }

    public supplierDetails(Builder builder) {
        this.supplierName = builder.supplierName;
        this.supplierMobile = builder.supplierMobile;
        this.supplierEmail = builder.supplierEmail;
    }

    // Getter
    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierMobile() {
        return supplierMobile;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    // Builder class
    public static class Builder {
        private final String supplierName;
        private final String supplierMobile;
        private final String supplierEmail;

        public Builder(String supplierName, String supplierMobile, String supplierEmail) {
            this.supplierName = supplierName;
            this.supplierMobile = supplierMobile;
            this.supplierEmail = supplierEmail;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return Objects.equals(supplierName, builder.supplierName) && Objects.equals(supplierMobile, builder.supplierMobile) && Objects.equals(supplierEmail, builder.supplierEmail);
        }

        @Override
        public int hashCode() {
            return Objects.hash(supplierName, supplierMobile, supplierEmail);
        }

        public supplierDetails build() {
            supplierDetails supplierDetails = new supplierDetails();
            supplierDetails.supplierName = this.supplierName;
            supplierDetails.supplierMobile = this.supplierMobile;
            supplierDetails.supplierEmail = this.supplierEmail;
            return new supplierDetails(this);
        }
    }

    @Override
    public String toString() {
        return "SupplierDetails{" +
                "supplierName='" + supplierName + '\'' +
                ", supplierMobile='" + supplierMobile + '\'' +
                ", supplierEmail='" + supplierEmail + '\'' +
                '}';
    }
}
