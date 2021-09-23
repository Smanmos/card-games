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
}
