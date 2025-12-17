package BaristaV3.TemplateMethod;

public abstract class CaffeineBeverageWithHook {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring beverage into cup");
    }

    // This is the hook method. Subclasses can override this method to provide their
    // own implementation.
    // By default, it returns true, meaning condiments will be added.
    protected boolean customerWantsCondiments() {
        return true;
    }
}
