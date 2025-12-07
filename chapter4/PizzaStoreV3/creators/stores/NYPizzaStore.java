package PizzaStoreV3.creators.stores;

import PizzaStoreV3.creators.factories.NYPizzaIngredientFactory;
import PizzaStoreV3.creators.factories.PizzaIngredientFactory;
import PizzaStoreV3.pizzas.CheesePizza;
import PizzaStoreV3.pizzas.ClamPizza;
import PizzaStoreV3.pizzas.PepperoniPizza;
import PizzaStoreV3.pizzas.Pizza;
import PizzaStoreV3.pizzas.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
