package PizzaStoreV3;

import PizzaStoreV3.creators.stores.ChicagoPizzaStore;
import PizzaStoreV3.creators.stores.NYPizzaStore;
import PizzaStoreV3.creators.stores.PizzaStore;
import PizzaStoreV3.pizzas.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Adam ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Rob ordered a " + pizza + "\n");
    }
}
