package Lection06.online;

import Lection05.online.test.Coordinate;
import Lection06.online.model.Actor;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 30.08.2021
 */

public class Player extends Actor {

    public Player(String name, int health, int attackPoint, int positionX, int positionY) {
        super(name, health, attackPoint, positionX, positionY);
    }

    public void changePosition() {
        positionX += 1;
        positionY += 1;
        System.out.println("My next position is [" + positionX + ":" + positionY + "]");
    }

    public void speak() {
        System.out.println("Hello! My name is " + name);
    }

    @Override
    public void eat() {
        System.out.println(name + " eat");
    }
}
