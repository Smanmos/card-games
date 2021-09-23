package cardgames.dominion;

public enum DominionPhase {
    ACTION_PHASE,
    BUY_PHASE,
    CLEANUP_PHASE;

    public boolean canPlay(DominionCard card){
        return true;
    }
}
