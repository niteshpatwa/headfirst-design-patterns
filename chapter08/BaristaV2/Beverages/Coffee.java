package BaristaV2.Beverages;

import BaristaV2.TemplateMethod.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
