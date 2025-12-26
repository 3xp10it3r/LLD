package models;

public class Product {
    private final String name;
    private final double price;
    private final Brand brand;
    private final Category category;

    public Product(String name, double price, Brand brand, Category category) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Brand getBrand() {
        return brand;
    }

    public Category getCategory() {
        return category;
    }
}
