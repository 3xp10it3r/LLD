package services.filterService;

import models.Product;

import java.util.List;
import java.util.stream.Collectors;

public class BrandFilterCriteria implements Criteria{
    private final String brandName;

    public BrandFilterCriteria(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public List<Product> satisfy(List<Product> products) {
        return products.stream()
                .filter(product -> product.getBrand().getName().equals(brandName))
                .collect(Collectors.toList());
    }
}
