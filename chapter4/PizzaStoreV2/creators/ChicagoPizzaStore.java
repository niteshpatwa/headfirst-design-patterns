package PizzaStoreV2.creators;

import PizzaStoreV2.pizzas.Pizza;
import PizzaStoreV2.pizzas.chicago.ChicagoStyleCheesePizza;
import PizzaStoreV2.pizzas.chicago.ChicagoStyleClamPizza;
import PizzaStoreV2.pizzas.chicago.ChicagoStylePepperoniPizza;
import PizzaStoreV2.pizzas.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        }

        return pizza;
    }

}
