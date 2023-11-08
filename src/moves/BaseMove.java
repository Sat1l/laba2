package moves;

import laba2.Main;
import ru.ifmo.se.pokemon.*;

public class BaseMove extends PhysicalMove {
    public BaseMove(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }

}
