package cardgames.dominion;

import cardgames.Card;
import cardgames.dominion.instruction.Instruction;

import java.util.EnumSet;

public abstract class DominionCard extends Card{
    private EnumSet<DominionTypes> types;

    public DominionCard(String name, EnumSet<DominionTypes> types) {
        super(name);
        this.types = EnumSet.copyOf(types);
    }

    public abstract Instruction getEffect();
}
