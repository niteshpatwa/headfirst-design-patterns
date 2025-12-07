package PizzaStoreV3.creators.factories;

import PizzaStoreV3.ingredients.cheeses.Cheese;
import PizzaStoreV3.ingredients.cheeses.ReggianoCheese;
import PizzaStoreV3.ingredients.clams.Clams;
import PizzaStoreV3.ingredients.clams.FreshClams;
import PizzaStoreV3.ingredients.doughs.Dough;
import PizzaStoreV3.ingredients.doughs.ThinCrustDough;
import PizzaStoreV3.ingredients.pepperoni.Pepperoni;
import PizzaStoreV3.ingredients.pepperoni.SlicedPepperoni;
import PizzaStoreV3.ingredients.sauces.MarinaraSauce;
import PizzaStoreV3.ingredients.sauces.Sauce;
import PizzaStoreV3.ingredients.veggies.Garlic;
import PizzaStoreV3.ingredients.veggies.Mushroom;
import PizzaStoreV3.ingredients.veggies.Onion;
import PizzaStoreV3.ingredients.veggies.RedPepper;
import PizzaStoreV3.ingredients.veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClams() {
        return new FreshClams();
    }
}
