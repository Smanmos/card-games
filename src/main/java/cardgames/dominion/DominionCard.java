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
        this.effect = effect;
    }

    public int getCost(){
        return cost;
    }

    public Instruction getEffect(){
        return effect;
    }

    public EnumSet<DominionTypes> getTypes() {
        return types;
    }

    @Override
    public boolean equals(Object other){
        if (this == other){
            return true;
        }
        else if (!(other instanceof DominionCard)){
            return false;
        }
        else {
            DominionCard otherCard = (DominionCard)other;
            return this.cost == otherCard.cost
                    && this.types.equals(otherCard.types)
                    && this.getName().equals(otherCard.getName())
                    && this.effect.equals(otherCard.effect);
        }
    }
}
