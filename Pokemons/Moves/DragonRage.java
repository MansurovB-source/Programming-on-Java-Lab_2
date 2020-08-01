package Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public class DragonRage extends SpecialMove {
    public DragonRage() {
        super(Type.DRAGON, 40.0, 100.0);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int) Math.round(v));
    }
}
