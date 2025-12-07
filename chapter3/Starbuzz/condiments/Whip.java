package Starbuzz.condiments;

import Starbuzz.coffees.Beverage;

public class Whip extends CondimentDecoractor {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return 0.10 + beverage.cost();
    }
}
