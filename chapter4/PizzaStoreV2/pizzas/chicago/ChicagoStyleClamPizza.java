package PizzaStoreV2.pizzas.chicago;

import PizzaStoreV2.pizzas.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Deep Dish Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }

    public void cut() {
        System.out.println("Cutting " + name + " into square slices");
    }
}
