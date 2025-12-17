package Starbuzz.condiments;

import Starbuzz.coffees.Beverage;

public class Soy extends CondimentDecoractor {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return 0.15 + beverage.cost();
    }
}
