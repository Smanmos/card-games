package cardgames.dominion;

import cardgames.Player;

public interface DominionPlayer extends Player {
    public abstract DominionPlayerState getState();
}
