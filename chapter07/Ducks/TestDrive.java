package Ducks;

import Ducks.Adapters.DuckAdapter;
import Ducks.Adapters.TurkeyAdapter;
import Ducks.Ducks.Duck;
import Ducks.Ducks.MallardDuck;
import Ducks.Turkeys.Turkey;
import Ducks.Turkeys.WildTurkey;

public class TestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("The Turkey says...");
        testTurkey(turkey);

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

        System.out.println("\nThe DuckAdapter says...");
        testTurkey(duckAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    private static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}
