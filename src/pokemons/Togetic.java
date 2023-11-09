package pokemons;

import moves.illumise.ThunderWave;
import moves.togepi.Charm;
import moves.togepi.Flamethrower;
import moves.togepi.SteelWing;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Togetic extends Pokemon {
    public Togetic(String name, int level){
        super(name, level);
        super.setType(Type.FAIRY, Type.FLYING);
        super.setStats(55, 40, 85,80, 105, 40);

        Flamethrower flamethrower = new Flamethrower(90, 100);
        ThunderWave thunderWave = new ThunderWave(0, 90);
        Charm charm = new Charm(0, 100);
        SteelWing steelWing = new SteelWing(70, 90);
        super.setMove(flamethrower,thunderWave, charm);
    }
}
