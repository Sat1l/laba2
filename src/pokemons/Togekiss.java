package pokemons;

import moves.illumise.ThunderWave;
import moves.togepi.Flamethrower;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Togekiss extends Pokemon {
    public Togekiss(String name, int level){
        super(name, level);
        super.setType(Type.FAIRY);
        super.setStats(35, 20, 65,40, 65, 20);

        Flamethrower flamethrower = new Flamethrower(90, 100);
        ThunderWave thunderWave = new ThunderWave(0, 90);
        super.setMove(flamethrower,thunderWave);
    }
}
