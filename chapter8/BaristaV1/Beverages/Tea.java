package BaristaV1.Beverages;

public class Tea {
    public void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void steepTeaBag() {
        System.out.println("Steeping the tea bag");
    }

    private void pourInCup() {
        System.out.println("Pouring tea into cup");
    }

    private void addLemon() {
        System.out.println("Adding lemon");
    }
}
