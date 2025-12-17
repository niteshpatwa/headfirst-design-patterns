package PizzaStoreV3.creators.factories;

import PizzaStoreV3.ingredients.cheeses.Cheese;
import PizzaStoreV3.ingredients.cheeses.MozzarellaCheese;
import PizzaStoreV3.ingredients.clams.Clams;
import PizzaStoreV3.ingredients.clams.FrozenClams;
import PizzaStoreV3.ingredients.doughs.Dough;
import PizzaStoreV3.ingredients.doughs.ThickCrustDough;
import PizzaStoreV3.ingredients.pepperoni.Pepperoni;
import PizzaStoreV3.ingredients.pepperoni.SlicedPepperoni;
import PizzaStoreV3.ingredients.sauces.PlumTomatoSauce;
import PizzaStoreV3.ingredients.sauces.Sauce;
import PizzaStoreV3.ingredients.veggies.BlackOlives;
import PizzaStoreV3.ingredients.veggies.Eggplant;
import PizzaStoreV3.ingredients.veggies.Spinach;
import PizzaStoreV3.ingredients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Spinach(), new BlackOlives(), new Eggplant() };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClams() {
        return new FrozenClams();
    }

}
