package cardgames;

import java.util.ArrayList;
import java.util.List;

public class DiscardPile<T extends Card> {
    private List<T> cards;

    public DiscardPile(List<T> cards){
        this.cards = new ArrayList<>(cards);
    }

    public DiscardPile(){
        this(new ArrayList<>());
    }

    @Override
    public boolean equals(Object other){
        if (this == other){
            return true;
        }
        else if (!(other instanceof DiscardPile)){
            return false;
        }
        else {
            DiscardPile otherDiscard = (DiscardPile)other;
            return cards.equals(otherDiscard.cards);
        }
    }
}
