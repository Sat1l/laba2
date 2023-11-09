package moves.omanyte;

import laba2.Main;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class SpikeCannon extends PhysicalMove {
    public SpikeCannon(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def, damage);
        if(Main.chance(3d/8d)){
            super.applyOppDamage(def, damage*2);
        }
        if(Main.chance(3d/8d)){
            super.applyOppDamage(def, damage*3);
        }
        if(Main.chance(1d/8d)){
            super.applyOppDamage(def, damage*4);
        }
        if(Main.chance(1d/8d)){
            super.applyOppDamage(def, damage*5);
        }

    }


    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
