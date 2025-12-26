package services.filterService;

import models.Product;

import java.util.List;
import java.util.stream.Collectors;

public class AndFilterCriteria implements Criteria {
    private final List<Criteria> criteriaList;

    public AndFilterCriteria(List<Criteria> criteriaList) {
        this.criteriaList = criteriaList;
    }

    @Override
    public List<Product> satisfy(List<Product> products) {
        return products.stream()
                .filter(product -> criteriaList.stream()
                        .noneMatch(criteria -> criteria.satisfy(List.of(product)).isEmpty())
                ).collect(Collectors.toList());

//        or
//        List<Product> filteredProducts = products;
//        for(Criteria criteria : criteriaList) {
//            filteredProducts = criteria.satisfy(filteredProducts);
//        }
//        return filteredProducts;
    }
}
