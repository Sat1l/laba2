package moves.illumise;

import ru.ifmo.se.pokemon.*;

public class StruggleBug extends SpecialMove{
    public StruggleBug(double pow, double acc) {
        super(Type.BUG, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
