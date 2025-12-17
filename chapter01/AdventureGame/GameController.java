package AdventureGame;

import AdventureGame.Characters.Character;
import AdventureGame.Characters.Queen;
import AdventureGame.FightingStyle.BowAndArrowBehaviour;
import AdventureGame.FightingStyle.SwordBahaviour;

public class GameController {
    public static void main(String[] args) {
        Character queen = new Queen();
        queen.setWeapon(new BowAndArrowBehaviour());
        queen.fight();

        queen.setWeapon(new SwordBahaviour());
        queen.fight();
    }
}
