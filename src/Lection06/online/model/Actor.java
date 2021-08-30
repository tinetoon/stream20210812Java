package Lection06.online.model;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 30.08.2021
 */

public abstract class Actor {

    protected String name;
    protected int health;
    protected int positionX;
    protected int positionY;
    protected int attackPoint;

    public Actor(String name, int health, int attackPoint, int positionX, int positionY) {
        this.name = name;
        this.health = health;
        this.attackPoint = attackPoint;
        this.positionX = positionX;
        this.positionY = positionY;
        System.out.println("This is constructor Actor");
    }

    public void takeDamage(int valueDamage) {
        health -= valueDamage;
        System.out.println(name + " has take damage is " + valueDamage + ". Player HP = " + health);
    }

    public void attack() {
        System.out.println(name + " give damage on " + attackPoint);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public abstract void eat();


}
