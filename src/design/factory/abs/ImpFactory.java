package design.factory.abs;

import design.factory.DNFGame;
import design.factory.Game;
import design.factory.LOLGame;

public class ImpFactory extends AbsFactory{
    @Override
    public Game getGameLOL() {
        return new LOLGame();
    }

    @Override
    public Game getGameDNF() {
        return new DNFGame();
    }
}
