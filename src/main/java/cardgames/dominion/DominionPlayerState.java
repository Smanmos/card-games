package cardgames.dominion;

import cardgames.Deck;
import cardgames.DiscardPile;
import cardgames.Hand;

import java.util.ArrayList;

public class DominionPlayerState {
    private Deck<DominionCard> deck;
    private Hand<DominionCard> hand;
    private DiscardPile<DominionCard> discardPile;
    private PlayArea playArea;
    private DominionPhase phase;

    public DominionPlayerState(Deck<DominionCard> deck, Hand<DominionCard> hand,
            DiscardPile<DominionCard> discardPile, PlayArea playArea,
            DominionPhase phase){
        this.deck = deck;
        this.hand = hand;
        this.discardPile = discardPile;
        this.playArea = playArea;
        this.phase = phase;
    }

    public DominionPlayerState(){
        this(new Deck<>(new ArrayList<>()), new Hand<>(), new DiscardPile<>(), new PlayArea(),
                DominionPhase.ACTION_PHASE);
    }

    @Override
    public boolean equals(Object other){
        if (this == other){
            return true;
        }
        else if (!(other instanceof DominionPlayerState)){
            return false;
        }
        else {
            DominionPlayerState otherState = (DominionPlayerState)other;
            return deck.equals(otherState.deck)
                    && hand.equals(otherState.hand)
                    && discardPile.equals(otherState.discardPile)
                    && playArea.equals(otherState.playArea)
                    && phase.equals(otherState.phase);
        }
    }
}
