package cardgames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck<T extends Card> {
    private List<T> cards;
    public Deck(List<T> cards){
        this.cards = new ArrayList<T>();
        Collections.copy(this.cards, cards);
    } 
}
