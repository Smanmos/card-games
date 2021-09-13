import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;
    public Deck(List<Card> cards){
        this.cards = new ArrayList<Card>();
        Collections.copy(this.cards, cards);
    } 
}
