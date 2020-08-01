package Moves;

import ru.ifmo.se.pokemon.*;

/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public class AerialAce extends PhysicalMove {
    public AerialAce() {
        super(Type.FLYING, 60, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().attack(100).turns(-1));
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int) Math.round(v));
    }
}
