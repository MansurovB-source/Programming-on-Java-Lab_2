import Moves.AerialAce;
import Moves.FlashCannon;
import Moves.Leer;
import Moves.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public class Cobalion extends Pokemon {
    public Cobalion(String name, int level) {
        super(name, level);
        setType(Type.STEEL, Type.FIGHTING);
        setStats(91.0, 90.0, 129.0, 90.0, 72.0, 108.0);
        setMove(new ThunderWave(), new Leer(), new AerialAce(), new FlashCannon());
    }
}
