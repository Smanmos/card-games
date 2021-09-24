package cardgames.dominion.instruction;

import cardgames.dominion.DominionTurn;
import org.json.JSONArray;

public abstract class Instruction {
    public abstract void execute(DominionTurn turn);

    public static Instruction of(JSONArray jsonInstruction){
        switch (jsonInstruction.getString(0)){
        case "add_coin":
            return new InstructionAddCoin(jsonInstruction.getInt(1));
        default:
            throw new IllegalArgumentException("Invalid instruction");
        }
    }
}
