public class StandardPokerCard extends PokerCard {
    private PokerSuit suit;
    private PokerRank rank;
    public StandardPokerCard(PokerSuit suit, PokerRank rank){
        super(rank.name + " of " + suit.name);
    }
}
