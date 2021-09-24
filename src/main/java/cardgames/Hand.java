package cardgames;

import java.util.ArrayList;
import java.util.List;

public class Hand<T extends Card> {
    private List<T> cards;

    public Hand(List<T> cards){
        this.cards = new ArrayList<>(cards);
    }

    public Hand(){
        this(new ArrayList<>());
    }

    @Override
    public boolean equals(Object other){
        if (this == other){
            return true;
        }
        else if (!(other instanceof Hand)){
            return false;
        }
        else {
            Hand otherHand = (Hand)other;
            return cards.equals(otherHand.cards);
        }
    }
}
