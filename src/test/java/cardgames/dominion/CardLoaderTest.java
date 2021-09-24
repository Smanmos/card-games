package cardgames.dominion;

import cardgames.dominion.card.Copper;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class CardLoaderTest {

    @Test
    public void load(){
        Map<String,DominionCard> cards = CardLoader.load("../../data/dominion/base_cards.json");
        DominionCard card = cards.get("Copper");
        DominionCard copper = new Copper();
        assertEquals(copper.getName(), card.getName());
        assertEquals(copper.getTypes(), card.getTypes());
        assertEquals(copper.getEffect(), card.getEffect());
        assertEquals(copper.getCost(), card.getCost());
        assertEquals(copper, card);
    }
}