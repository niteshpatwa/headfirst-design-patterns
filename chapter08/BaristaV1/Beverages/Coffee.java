package BaristaV1.Beverages;

public class Coffee {
    public void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Brewing the coffee grinds");
    }

    private void pourInCup() {
        System.out.println("Pouring coffee into cup");
    }

    private void addSugarAndMilk() {
        System.out.println("Adding sugar and milk");
    }
}
