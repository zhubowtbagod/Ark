package design.factory.simple;

import design.factory.DNFGame;
import design.factory.Game;
import design.factory.LOLGame;

public class SimpleFactory {

    static final  String LOL="LOL";
    static final String DNF="DNF";


    public  static Game buildGame(String type){
        switch (type){
            case LOL:

                return new LOLGame();

            case DNF:
                return  new DNFGame();
        }
        return null;
    }

}
