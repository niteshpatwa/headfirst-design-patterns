package PizzaStoreV3.creators.stores;

import PizzaStoreV3.creators.factories.ChicagoPizzaIngredientFactory;
import PizzaStoreV3.creators.factories.PizzaIngredientFactory;
import PizzaStoreV3.pizzas.CheesePizza;
import PizzaStoreV3.pizzas.ClamPizza;
import PizzaStoreV3.pizzas.PepperoniPizza;
import PizzaStoreV3.pizzas.Pizza;
import PizzaStoreV3.pizzas.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }

        return pizza;
    }

}
