package LLD.BuilderDesignPattern.BetterCode;

import java.util.ArrayList;

public class Builder {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
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
