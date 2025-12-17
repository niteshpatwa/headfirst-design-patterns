package BaristaV2;

import BaristaV2.Beverages.Coffee;
import BaristaV2.Beverages.Tea;
import BaristaV2.TemplateMethod.CaffeineBeverage;

public class Barista {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();

        System.out.println("Making tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}
