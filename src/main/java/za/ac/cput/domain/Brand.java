/*
Likhaya Kalimashe
240329171
Group10
*
* */


package za.ac.cput.domain;

import java.util.Objects;

public class Brand {
    private final Long brandId;
    private final String name;
    private final String logo;
    private final String description;

    // Private constructor
    private Brand(Builder builder) {
        this.brandId = builder.brandId;
        this.name = builder.name;
        this.logo = builder.logo;
        this.description = builder.description;
    }

    // Getters
    public Long getBrandId() {
        return brandId;
    }

    public String getName() {
        return name;
    }

    public String getLogo() {
        return logo;
    }

    public String getDescription() {
        return description;
    }

    // Equals and hashCode methods for proper comparison and collection usage
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Brand)) return false;
        Brand brand = (Brand) o;
        return Objects.equals(brandId, brand.brandId) &&
                Objects.equals(name, brand.name) &&
                Objects.equals(logo, brand.logo) &&
                Objects.equals(description, brand.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandId, name, logo, description);
    }

    // Builder class
    public static class Builder {
        private final Long brandId;
        private final String name;
        private String logo;
        private String description;

        // Constructor with required parameters
        public Builder(Long brandId, String name) {
            this.brandId = brandId;
            this.name = name;
        }

        // Method to set optional parameter
        public Builder logo(String logo) {
            this.logo = logo;
            return this;
        }

        // Method to set optional parameter
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        // Build method to create Brand instance
        public Brand build() {
            return new Brand(this);
        }

        // toString method to provide string representation of the object
        @Override
        public String toString() {
            return "Brand.Builder{" +
                    "brandId=" + brandId +
                    ", name='" + name + '\'' +
                    ", logo='" + logo + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }
    }
}
