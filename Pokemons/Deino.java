import Moves.DragonRage;
import Moves.DragonRush;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public class Deino extends Pokemon {
    public Deino(String name, int level) {
        super(name, level);
        setType(Type.DARK, Type.DRAGON);
        setStats(52.0, 65.0, 50.0, 45.0, 50.0, 38.0);
        setMove(new DragonRage(), new DragonRush());
    }
}
