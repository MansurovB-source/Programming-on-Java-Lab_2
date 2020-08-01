import Moves.DoubleHit;
import Moves.QuickAttack;
import Moves.Scald;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public class Buizel extends Pokemon {
    public Buizel(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(55.0, 65.0, 35.0, 60.0, 30.0, 85.0);
        setMove(new Scald(), new DoubleHit(), new QuickAttack());
    }
}
