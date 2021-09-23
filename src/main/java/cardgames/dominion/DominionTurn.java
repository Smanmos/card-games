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
    }

    public void addCoins(int addedCoins){
        numCoins += addedCoins;
    }
}
