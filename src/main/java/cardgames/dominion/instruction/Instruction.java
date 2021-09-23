package cardgames.dominion.instruction;

import cardgames.dominion.DominionTurn;

public abstract class Instruction {
    public abstract void execute(DominionTurn turn);
}
