package cardgames.dominion.instruction;

import cardgames.dominion.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ExecuterTest {
    DominionCard copper;
    DominionCard silver;
    DominionCard gold;
    @Before
    public void setUp(){
        Map<String,DominionCard> cards = CardLoader.load("../../data/dominion/base_cards.json");
        copper = cards.get("Copper");
        silver = cards.get("Silver");
        gold = cards.get("Gold");
        assertNotNull(copper);
        assertNotNull(silver);
        assertNotNull(gold);
    }

    @Test
    public void testExecuteCopper(){
        assertNotNull(copper);
        DominionTurn startTurn = new DominionTurn(new DominionPlayerState());
        DominionTurn targetTurn = new DominionTurn(new DominionPlayerState(), DominionPhase.ACTION_PHASE,
                1, 1, 1);
        Executer.execute(startTurn, copper.getEffect());
        assertEquals(targetTurn, startTurn);
    }

    @Test
    public void testExecuteSilver(){
        assertNotNull(silver);
        DominionTurn startTurn = new DominionTurn(new DominionPlayerState());
        DominionTurn targetTurn = new DominionTurn(new DominionPlayerState(), DominionPhase.ACTION_PHASE,
                1, 1, 2);
        Executer.execute(startTurn, silver.getEffect());
        assertEquals(targetTurn, startTurn);
    }

    @Test
    public void testExecuteGold(){
        assertNotNull(gold);
        DominionTurn startTurn = new DominionTurn(new DominionPlayerState());
        DominionTurn targetTurn = new DominionTurn(new DominionPlayerState(), DominionPhase.ACTION_PHASE,
                1, 1, 3);
        Executer.execute(startTurn, gold.getEffect());
        assertEquals(targetTurn, startTurn);
    }
}