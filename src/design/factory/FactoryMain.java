package design.factory;

import design.factory.abs.ImpFactory;
import design.factory.fac.GameFactory;
import design.factory.fac.LOLFactory;
import design.factory.simple.SimpleFactory;

public class FactoryMain {


    public static void main(String[] args) {


        /**
         * 简单工厂
         */

        Game lolGame= SimpleFactory.buildGame("LOL");

        /**
         *工厂方法
         */

        Game lolGame1= new LOLFactory().buildGame();

        /**
         *抽象工厂
         */
        ImpFactory factory=new ImpFactory();
        Game lolGame2=factory.getGameLOL();

    }
}
