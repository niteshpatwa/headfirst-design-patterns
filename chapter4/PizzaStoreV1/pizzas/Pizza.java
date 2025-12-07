package PizzaStoreV1.pizzas;

import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new java.util.ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    public void bake() {
        System.out.println("Baking " + name + " for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting " + name + " into diagonal slices");
    }

    public void box() {
        System.out.println("Placing " + name + " in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
