package moves.togepi;

import ru.ifmo.se.pokemon.*;

public class Charm extends StatusMove {
    public Charm(double pow, double acc) {
        super(Type.FAIRY, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.ATTACK, -2);
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
