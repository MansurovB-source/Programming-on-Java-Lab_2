package Moves;

import ru.ifmo.se.pokemon.*;

/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public class Crunch extends PhysicalMove {
    public  Crunch() {
        super(Type.DARK, 80.0, 100.0);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, 80);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.2).stat(Stat.DEFENSE, -1));
    }
}
