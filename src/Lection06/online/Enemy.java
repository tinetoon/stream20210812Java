package Lection06.online;

import Lection06.online.model.Actor;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 30.08.2021
 */

public class Enemy extends Actor {

    private float dexterity;
//    private String name;

    public Enemy(String name, int health, int attackPoint, int positionX, int positionY) {
        super(name, health, attackPoint, positionX, positionY);
        this.dexterity = 15.0f;
    }

    public Enemy(String name, int health, int attackPoint, int positionX, int positionY, float dexterity) {
        super(name, health, attackPoint, positionX, positionY);
        this.dexterity = dexterity;
        System.out.println("This is constructor Enemy");

    }

    public void escape() {
        if (health < 10) {
            System.out.println(name + " has escape the battle");
        }
    }

    @Override
    public void eat() {
        System.out.println(name + " eat-eat");
    }
}
