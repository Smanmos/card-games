package cardgames.dominion;

import java.util.ArrayList;
import java.util.List;

public class PlayArea {
    private List<DominionCard> cards;

    public PlayArea(){
        cards = new ArrayList<>();
    }

    public void add(DominionCard card){
        cards.add(card);
    }

    public void clear(){
        cards.clear();
    }
}
