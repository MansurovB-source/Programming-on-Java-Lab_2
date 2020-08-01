package Moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

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
}
