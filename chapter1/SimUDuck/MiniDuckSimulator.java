package SimUDuck;

import SimUDuck.Behaviours.FlyRocketPowered;
import SimUDuck.Ducks.Duck;
import SimUDuck.Ducks.MallardDuck;
import SimUDuck.Ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
