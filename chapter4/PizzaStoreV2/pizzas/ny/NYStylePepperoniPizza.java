package PizzaStoreV2.pizzas.ny;

import PizzaStoreV2.pizzas.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "NY Style Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Sliced Pepperoni");
        toppings.add("Grated Reggiano Cheese");
    }
}
