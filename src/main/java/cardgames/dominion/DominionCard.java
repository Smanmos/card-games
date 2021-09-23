package cardgames.dominion;

import cardgames.Card;
import cardgames.dominion.instruction.Instruction;

import java.util.EnumSet;

public class DominionCard extends Card{
    private EnumSet<DominionTypes> types;
    private int cost;
    private Instruction effect;

    public DominionCard(String name, EnumSet<DominionTypes> types, int cost, Instruction effect){
        super(name);
        this.types = EnumSet.copyOf(types);
        this.cost = cost;
    }

    public int getCost(){
        return cost;
    }

    public Instruction getEffect(){
        return effect;
    }
}
