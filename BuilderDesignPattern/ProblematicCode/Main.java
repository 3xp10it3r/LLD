package LLD.BuilderDesignPattern.ProblematicCode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Product product = new Product(
                "Laptop",
                "High performance laptop",
                "BrandX",
                1500.00,
                10,
                "Electronics",
                "2024-01-01",
                "2024-01-02",
                new ArrayList<>()
        );
    }
}
