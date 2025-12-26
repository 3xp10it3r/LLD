package services.filterService.factories;

import services.filterService.strategies.GreaterThanStrategy;
import services.filterService.strategies.LessThanStrategy;
import services.filterService.strategies.PriceComparisonStrategy;
import utils.Operator;

public class PriceFilterFactory {

    public static PriceComparisonStrategy create(Operator condition) {
        return switch (condition) {
            case Operator.LESS_THAN -> new LessThanStrategy();
            case Operator.GREATER_THAN -> new GreaterThanStrategy();
            default -> null;
        };
    }

}
