package Moves;

import ru.ifmo.se.pokemon.*;

/**
 * Created by IntelliJ IDEA.
 * Author: Behruz Mansurov
 */
public class FlashCannon extends SpecialMove {
    public FlashCannon() {
        super(Type.STEEL, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.5).stat(Stat.SPECIAL_DEFENSE, -1));
    }
}
