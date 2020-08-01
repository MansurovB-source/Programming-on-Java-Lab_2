package Moves;

import ru.ifmo.se.pokemon.*;

/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public class ThunderWave extends StatusMove {
    public ThunderWave() {
        super(Type.ELECTRIC, 0.0, 90.0);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().attack(75.0).turns(0));
        pokemon.addEffect(new Effect().stat(Stat.SPEED, -3));
    }
}
