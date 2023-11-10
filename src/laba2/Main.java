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
        Illumise zhuk = new Illumise("zhuk",1);
        Omanyte rakushka = new Omanyte("rakushka", 1);
        Omastar zloy = new Omastar("zloy", 1);
        Togepi egg = new Togepi("egg", 1);
        Togetic shpala = new Togetic("shpala", 1);
        Togekiss tu34 = new Togekiss("tu34", 1);
        b.addAlly(zhuk);
        b.addAlly(zloy);
        b.addAlly(shpala);
        b.addFoe(rakushka);
        b.addFoe(egg);
        b.addFoe(tu34);
        b.go();
    }

    public static boolean chance(double d){
        return d > Math.random();
    }
}
