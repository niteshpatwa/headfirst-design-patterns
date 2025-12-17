package PizzaStoreV1.creators;

import PizzaStoreV1.pizzas.CheesePizza;
import PizzaStoreV1.pizzas.ClamPizza;
import PizzaStoreV1.pizzas.PepperoniPizza;
import PizzaStoreV1.pizzas.Pizza;
import PizzaStoreV1.pizzas.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
