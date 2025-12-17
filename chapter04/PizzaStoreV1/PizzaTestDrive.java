package PizzaStoreV1;

import PizzaStoreV1.creators.PizzaStore;
import PizzaStoreV1.creators.SimplePizzaFactory;
import PizzaStoreV1.pizzas.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
    }
}
