package pokemons;

import moves.omanyte.IceBeam;
import moves.omanyte.RockTomb;
import moves.omanyte.Waterfall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Omanyte extends Pokemon {
    public Omanyte(String name, int level){
        super(name, level);
        super.setType(Type.ROCK,Type.WATER);
        super.setStats(35, 40, 100,90, 55, 35);

        RockTomb rockTomb = new RockTomb(60, 95);
        Waterfall waterfall = new Waterfall(80, 100);
        IceBeam iceBeam = new IceBeam(90, 100);
        super.setMove(rockTomb, waterfall, iceBeam);
    }
}
