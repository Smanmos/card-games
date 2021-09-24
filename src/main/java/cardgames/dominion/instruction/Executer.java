package cardgames.dominion.instruction;

import cardgames.dominion.DominionTurn;

public class Executer {
    public static void execute(DominionTurn turn, Instruction instr){
        switch (instr.getType()){
        case ADD_COIN:
            executeAddCoin(turn, (InstructionAddCoin)instr);
            break;
        default:
            throw new UnsupportedOperationException("This instruction is not implemented");
        }
    }

    private static void executeAddCoin(DominionTurn turn, InstructionAddCoin instr){
        turn.addCoins(instr.getNumCoins());
    }
}
