package design.factory.fac;

import design.factory.DNFGame;
import design.factory.Game;
import design.factory.LOLGame;

public class DNFFactory extends  GameFactory{


    @Override
    public Game buildGame() {
        return new DNFGame();
    }
}
