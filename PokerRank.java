public enum PokerRank{
    ACE("ace"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("jack"),
    QUEEN("queen"),
    KING("king");

    public final String name;
    private PokerRank(String name){
        this.name = name;
    }
}
