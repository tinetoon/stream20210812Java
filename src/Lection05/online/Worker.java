package Lection05.online;

import Lection05.online.test.Coordinate;
import Lection05.online.test.Player;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 26.08.2021
 */

public class Worker {

    public static void main(String[] args) {
//        Player player1 = new Player();
//        Player player3 = new Player("Hello!");

//        Player player1 = new Player("Boris", 80, 5, 9, 16);

//        player1.speak();
//        player3.speak();

//        player1.name = "Boris";
//        player1.health = -80;
//        player1.coordinate.x = 5;
//        player1.coordinate.y = 9;
//        player1.attackPoint = 16;
//
//        player1.sword.name = "Sword1";
//        player1.isAlive = (player1.health > 0) ? true : false;
//
//        System.out.println(player1.name);
//        System.out.println(player1.getName());
//
//        player1.setName("Qwerty");
//
//        System.out.println(player1.getName());
//
//        player1.speak();
//        player1.changePosition();
//        player1.takeDamage(20);
//
//        System.out.println("Name is " + player1.name + ", his HP = " + player1.health);

//        Player player2 = new Player();
//        player2.name = "Olga";
//        player2.health = 60;
//        player2.positionX = 10;
//        player2.positionY = 99;
//        player2.attackPoint = 20;
//        player2.isAlive = true;
//
//        System.out.println("Name is " + player2.name + ", his HP = " + player2.health);

        System.out.println(Player.value);
        System.out.println(Player.countLegs);
        System.out.println(Coordinate.countLegs);

    }

    public static int returnValue() {
        return 15 / 3;
    }
}
