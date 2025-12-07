package PizzaStoreV3.pizzas;

import PizzaStoreV3.ingredients.cheeses.Cheese;
import PizzaStoreV3.ingredients.clams.Clams;
import PizzaStoreV3.ingredients.doughs.Dough;
import PizzaStoreV3.ingredients.pepperoni.Pepperoni;
import PizzaStoreV3.ingredients.sauces.Sauce;
import PizzaStoreV3.ingredients.veggies.Veggies;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Clams clams;
    Pepperoni pepperoni;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough + "\n");
        }
        if (sauce != null) {
            result.append(sauce + "\n");
        }
        if (cheese != null) {
            result.append(cheese + "\n");
        }
        if (veggies != null) {
            result.append("Veggies: ");
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length - 1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clams != null) {
            result.append(clams + "\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni + "\n");
        }
        return result.toString();
    }
}
