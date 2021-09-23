package cardgames.dominion;

import cardgames.Deck;
import cardgames.DiscardPile;
import cardgames.Hand;

public class DominionPlayerState {
    private Deck<DominionCard> deck;
    private Hand<DominionCard> hand;
    private DiscardPile<DominionCard> discardPile;
    private PlayArea playArea;
    private DominionPhase phase;

    public DominionPlayerState(){
        deck = DominionUtil.STARTING_DECK;
    }
}
