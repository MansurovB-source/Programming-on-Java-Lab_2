import Moves.DoubleHitZweilous;
import Moves.DragonPulse;
import Moves.DragonRage;
import Moves.DragonRush;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public class Hydreigon extends Zweilous {
    public Hydreigon(String name, int level) {
        super(name, level);
        setType(Type.DARK, Type.DRAGON);
        setStats(92.0, 105.0, 90.0, 125.0, 90.0, 98.0);
        setMove(new DragonRage(), new DragonRush(), new DoubleHitZweilous(), new DragonPulse());
    }
}
