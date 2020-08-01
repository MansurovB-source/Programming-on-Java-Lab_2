import ru.ifmo.se.pokemon.Battle;

/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public class Battleground {
    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.addAlly(new Cobalion("Ban", 1));
        battle.addAlly(new Zweilous("Meliodas", 2));
        battle.addAlly(new Buizel("Escanor", 2));
        battle.addFoe(new Deino("Merlin", 2));
        battle.addFoe(new Floatzel("King", 2));
        battle.addFoe(new Hydreigon("Demon King", 1));
        battle.go();
    }
}
