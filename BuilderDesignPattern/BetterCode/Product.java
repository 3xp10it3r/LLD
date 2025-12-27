package LLD.BuilderDesignPattern.BetterCode;

import java.util.ArrayList;

public class Product {
    private String name;
    private String description;
    private double price;
    private int discount;
    private String category;
    private String createdAt;
    private String updatedAt;
    private String brand;
    private ArrayList<String> images;

    private Product(Builder b) {
        this.name = b.getName();
        this.description = b.getDescription();

        if(b.getPrice() > 0){
            this.price = b.getPrice();
        }
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String description;
        private double price;
        private int discount;
        private String category;
        private String createdAt;
        private String updatedAt;
        private String brand;
        private ArrayList<String> images;


        Builder() {

        }

        public Product build() {
            return new Product(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        // ..setters
        // getters

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public double getPrice() {
            return price;
        }


    }
}
