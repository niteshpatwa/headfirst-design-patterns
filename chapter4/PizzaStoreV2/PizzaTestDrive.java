package PizzaStoreV2;

import PizzaStoreV2.creators.ChicagoPizzaStore;
import PizzaStoreV2.creators.NYPizzaStore;
import PizzaStoreV2.creators.PizzaStore;
import PizzaStoreV2.pizzas.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
