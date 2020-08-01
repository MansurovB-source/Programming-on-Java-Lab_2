import Moves.Crunch;
import Moves.DoubleHit;
import Moves.QuickAttack;
import Moves.Scald;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public class Floatzel extends Buizel {

    public Floatzel(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(85.0, 105.0, 55.0, 85.0, 50.0, 115.0);
        setMove(new Scald(), new DoubleHit(), new QuickAttack(), new Crunch());
    }
}
