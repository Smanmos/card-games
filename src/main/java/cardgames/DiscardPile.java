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
}
