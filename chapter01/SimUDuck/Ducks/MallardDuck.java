package SimUDuck.Ducks;

import SimUDuck.Behaviours.FlyWithWings;
import SimUDuck.Behaviours.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck.");
    }
}
