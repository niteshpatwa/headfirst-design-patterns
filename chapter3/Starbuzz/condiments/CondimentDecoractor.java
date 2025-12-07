package Starbuzz.condiments;

import Starbuzz.coffees.Beverage;

public abstract class CondimentDecoractor extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
