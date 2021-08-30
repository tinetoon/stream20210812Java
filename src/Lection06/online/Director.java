package Lection06.online;

import Lection06.online.model.Actor;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 30.08.2021
 */

public class Director {

    public static void main(String[] args) {
//        Actor actor = new Actor("Actor", 50, 50, 25, 30);
        Player player = new Player("PlayerGame", 100, 2, 5, 50);
        Enemy enemy = new Enemy("EnemyGame", 150, 40, 90,50);
        Dragon dragon = new Dragon("Dragon", 300, 200, 10, 20, 99);

//        player.attack();
//        player.takeDamage(30);
//        player.changePosition();
//        player.speak();
//
//        enemy.attack();
//        enemy.takeDamage(145);
//        enemy.escape();
//
//        dragon.attack();
//        dragon.takeDamage(295);
//        dragon.escape();
//        dragon.fly();

//        Actor[] gameActors = {enemy, dragon, player};
//        for (int i = 0; i < gameActors.length; i++) {
//            gameActors[i].attack();
//            gameActors[i].takeDamage(20);
//            if (gameActors[i] instanceof Player) {
////                Player tmp = (Player) gameActors[i];
////                tmp.changePosition();
//                ((Player)gameActors[i]).changePosition();
//            }
//        }

//        byte abc = 15;
//        int cde = abc;
//        System.out.println("Normal = " + cde);
//
//        int abc1 = 1024;
//        byte cde1 = (byte) abc1;
//        System.out.println("Abnormal = " + cde1);

        int myI = 30;
        boolean myB = true;
        String word = "Tree";

        Object[] myObjs = {myI, myB, word, player, new Director()};
        for (int i = 0; i < myObjs.length; i++) {
            if (myObjs[i] instanceof Integer) {
                System.out.println(((Integer) myObjs[i]).toString());
            }
        }


    }
}
