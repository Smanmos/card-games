package cardgames;

public enum PokerSuit{
    CLUBS("clubs"),
    DIAMONDS("diamonds"),
    HEARTS("hearts"),
    SPADES("spades");

    public final String name;
    public final char initial;
    private PokerSuit(String name){
        this.name = name;
        this.initial = name.charAt(0);
    }
}