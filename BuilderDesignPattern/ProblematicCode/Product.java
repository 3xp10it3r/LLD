package LLD.BuilderDesignPattern.ProblematicCode;

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

    Product(String name, String description, String brand, double price, int discount, String category, String createdAt, String updatedAt, ArrayList<String> images) {
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.discount = discount;
        this.category = category;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.images = images;
    }

    // for optional fields
    Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // we cant have all combinations of constructors for optional fields
//    Product(String name, String brand, double price) {
//        this.name = name;
//        this.brand = brand;
//        this.price = price;
//    }
}
