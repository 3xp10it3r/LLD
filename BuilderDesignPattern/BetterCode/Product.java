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

    Product(Builder b) {
        this.name = b.getName();
        this.description = b.getDescription();

        if(b.getPrice() > 0){
            this.price = b.getPrice();
        }
    }
}
