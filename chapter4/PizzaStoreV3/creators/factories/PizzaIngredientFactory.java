package PizzaStoreV3.creators.factories;

import PizzaStoreV3.ingredients.cheeses.Cheese;
import PizzaStoreV3.ingredients.clams.Clams;
import PizzaStoreV3.ingredients.doughs.Dough;
import PizzaStoreV3.ingredients.pepperoni.Pepperoni;
import PizzaStoreV3.ingredients.sauces.Sauce;
import PizzaStoreV3.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();
}
