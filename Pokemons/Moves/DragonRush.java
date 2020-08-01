package Moves;

import ru.ifmo.se.pokemon.*;

/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public class DragonRush extends PhysicalMove {
    public DragonRush() {
        super(Type.DRAGON, 100.0, 75.0);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int) Math.round(v));
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.flinch(pokemon);
    }
}
