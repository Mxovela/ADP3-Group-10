/***
 * category.java
 * Author: Anathi Mhlom(220006695)
 * 17 May 2024
 */
package za.ac.cput.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class category {
    private Long categoryId;
    private String name;
    private String description;
    private List<product> products;

    // Constructor
    private category() {

    }

    private category(Builder builder) {
        this.categoryId = builder.categoryId;
        this.name = builder.name;
        this.description = builder.description;
        this.products = builder.products;
    }

    // Getters
    public Long getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<product> getProducts() {
        return products;
    }

    // Builder class
    public static class Builder {
        private final Long categoryId;
        private final String name;
        private final String description;
        private final List<product> products;

        public Builder(Long categoryId, String name, String description) {
            this.categoryId = categoryId;
            this.name = name;
            this.description = description;
            this.products = new ArrayList<>();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return Objects.equals(categoryId, builder.categoryId) && Objects.equals(name, builder.name) && Objects.equals(description, builder.description) && Objects.equals(products, builder.products);
        }

        @Override
        public int hashCode() {
            return Objects.hash(categoryId, name, description, products);
        }

        public category build() {
            category category = new category();
            category.categoryId = this.categoryId;
            category.name = this.name;
            category.description = this.description;
            category.products = new ArrayList<>();
            return new category(this);
        }

        @Override
        public String toString() {
            return "Category{" +
                    "categoryId=" + categoryId +
                    ", name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    ", products=" + products +
                    '}';
        }
    }
}