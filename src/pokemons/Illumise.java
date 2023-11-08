package pokemons;

import moves.illumise.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Illumise extends Pokemon {
    public Illumise(String name, int level){
        super(name, level);
        super.setType(Type.BUG);
        super.setStats(65, 47, 75,73, 85, 85);

        DazzlingGleam dazzlingGleam = new DazzlingGleam(80, 100);
        ShadowBall shadowBall = new ShadowBall(80,100);
        ThunderWave thunderWave = new ThunderWave(0, 90);
        StruggleBug struggleBug = new StruggleBug(50, 100);
        super.setMove(dazzlingGleam, shadowBall, thunderWave, struggleBug);
    }
}
