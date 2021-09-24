package cardgames.dominion;


public class DominionTurn {
    private DominionPlayerState playerState;
    private DominionPhase phase;
    private int numActions;
    private int numBuys;
    private int numCoins;

    public DominionTurn(DominionPlayerState playerState){
        this.playerState = playerState;
        numActions = 1;
        numBuys = 1;
        numCoins = 0;
        phase = DominionPhase.ACTION_PHASE;
    }

    public DominionTurn(DominionPlayerState playerState, DominionPhase phase,
            int numActions, int numBuys, int numCoins){
        this.playerState = playerState;
        this.phase = phase;
        this.numActions = numActions;
        this.numBuys = numBuys;
        this.numCoins = numCoins;
    }

    public void addCoins(int addedCoins){
        numCoins += addedCoins;
    }

    @Override
    public boolean equals(Object other){
        if (this == other){
            return true;
        }
        else if (!(other instanceof DominionTurn)){
            return false;
        }
        else {
            DominionTurn otherTurn = (DominionTurn)other;
            return playerState.equals(otherTurn.playerState)
                    && phase.equals(otherTurn.phase)
                    && numActions == otherTurn.numActions
                    && numBuys == otherTurn.numBuys
                    && numCoins == otherTurn.numCoins;
        }
    }
}
