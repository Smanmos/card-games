package cardgames.dominion;

public enum DominionTypes {
    ACTION("action"),
    TREASURE("treasure"),
    VICTORY("victory"),
    CURSE("curse");

    private String name;

    DominionTypes(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
