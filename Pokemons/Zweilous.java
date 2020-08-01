import ru.ifmo.se.pokemon.Type;

/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public class Zweilous extends Deino {
    public Zweilous(String name, int level) {
        super(name, level);
        setType(Type.DARK, Type.DRAGON);
        setStats(72.0, 85.0, 70.0, 65.0, 70.0, 58.0);

    }
}
