package laba2;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import pokemons.*;

public class Main {
    // https://pokemondb.net/pokedex/illumise
    // https://pokemondb.net/pokedex/omanyte
    // https://pokemondb.net/pokedex/omastar
    // https://pokemondb.net/pokedex/togepi
    // https://pokemondb.net/pokedex/togetic
    // https://pokemondb.net/pokedex/togekiss
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Pokemon("Чужой", 1);
        Illumise illumise = new Illumise("thing",1);
        b.addAlly(p1);
        b.addFoe(illumise);
        b.go();
    }

    public static boolean chance(double d){
        return d > Math.random();
    }
}
