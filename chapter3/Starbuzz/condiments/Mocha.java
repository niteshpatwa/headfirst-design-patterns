package Starbuzz.condiments;

import Starbuzz.coffees.Beverage;

public class Mocha extends CondimentDecoractor {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }
}
