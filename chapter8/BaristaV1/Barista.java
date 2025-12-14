package BaristaV1;

import BaristaV1.Beverages.Coffee;
import BaristaV1.Beverages.Tea;

public class Barista {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("Making tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}
