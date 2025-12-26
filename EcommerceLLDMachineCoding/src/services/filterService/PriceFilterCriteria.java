package services.filterService;

import models.Product;
import services.filterService.strategies.PriceComparisonStrategy;

import java.util.List;
import java.util.stream.Collectors;

public class PriceFilterCriteria implements Criteria {
    private final double price;
    private final PriceComparisonStrategy priceComparisonStrategy;

    public PriceFilterCriteria(double price, PriceComparisonStrategy priceComparisonStrategy) {
        this.priceComparisonStrategy = priceComparisonStrategy;
        this.price = price;
    }

    @Override
    public List<Product> satisfy(List<Product> products) {
        return products.stream()
                .filter(product -> priceComparisonStrategy.compare(product.getPrice(), this.price))
                .collect(Collectors.toList());
    }
}
