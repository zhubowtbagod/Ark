package design.factory.fac;

import design.factory.Game;
import design.factory.LOLGame;

public class LOLFactory extends  GameFactory{


    @Override
    public Game buildGame() {
        return new LOLGame();
    }
}
