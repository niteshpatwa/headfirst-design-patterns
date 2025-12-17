package Starbuzz.condiments;

import Starbuzz.coffees.Beverage;

public class Milk extends CondimentDecoractor {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        return 0.10 + beverage.cost();
    }
}
