package PizzaStoreV2.creators;

import PizzaStoreV2.pizzas.Pizza;
import PizzaStoreV2.pizzas.ny.NYStyleCheesePizza;
import PizzaStoreV2.pizzas.ny.NYStyleClamPizza;
import PizzaStoreV2.pizzas.ny.NYStylePepperoniPizza;
import PizzaStoreV2.pizzas.ny.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        }

        return pizza;
    }

}
