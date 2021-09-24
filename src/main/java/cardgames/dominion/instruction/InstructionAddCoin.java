package cardgames.dominion.instruction;

import cardgames.dominion.DominionCard;
import cardgames.dominion.DominionPlayerState;
import cardgames.dominion.DominionTurn;

public class InstructionAddCoin extends Instruction {
    private int numCoins;
    public InstructionAddCoin(int numCoins){
        this.numCoins = numCoins;
    }

    @Override
    public void execute(DominionTurn turn){
        turn.addCoins(numCoins);
    }

    @Override
    public boolean equals(Object other){
        if (this == other){
            return true;
        }
        else if (!(other instanceof InstructionAddCoin)){
            return false;
        }
        else {
            InstructionAddCoin otherInstr = (InstructionAddCoin)other;
            return this.numCoins == otherInstr.numCoins;
        }
    }
}
