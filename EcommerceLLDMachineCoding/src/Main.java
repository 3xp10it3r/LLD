import models.Brand;
import models.Category;
import models.Product;
import services.filterService.*;
import services.filterService.factories.PriceFilterFactory;
import utils.Operator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Brand b1 = new Brand("Apple");
        Brand b2 = new Brand("Samsung");
        Brand b3 = new Brand("OnePlus");

        Category c = new Category("Electronics");

        Product p1 = new Product("iPhone 17", 999.99, b1, c);
        Product p2 = new Product("Galaxy S23", 899, b2, c);
        Product p3 = new Product("iPhone 16", 799, b1, c);
        Product p4 = new Product("OnePlus 11", 699, b3, c);

        // (brand == "Apple" or brand == "Samsung")

        Criteria c1 = new BrandFilterCriteria("Apple");
        Criteria c2 = new BrandFilterCriteria("Samsung");

        Criteria orCriteria = new OrFilterCriteria(List.of(c1, c2));

        List<Product> products = List.of(p1, p2, p3, p4);

        List<Product> filteredProducts = orCriteria.satisfy(products);

        for(Product p : filteredProducts) {
            System.out.println(p.getName());
        }
        // or criteria implemented

        // (brand == "Apple" or brand == "Samsung") and price > 999

        Criteria priceCriteria = new PriceFilterCriteria(999, PriceFilterFactory.create(Operator.GREATER_THAN));

        Criteria andCriteria = new AndFilterCriteria(List.of(orCriteria, priceCriteria));

        List<Product> finalFilteredProducts = andCriteria.satisfy(products);

        System.out.println("---- Final Filtered Products ----");
        for(Product p : finalFilteredProducts) {
            System.out.println(p.getName());
        }

    }
}