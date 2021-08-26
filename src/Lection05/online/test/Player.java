package Lection05.online.test;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 26.08.2021
 */

public class Player {

    public static String value = "Qwerty12345";
    public static int countLegs = 2;

    private String name; // field class
    private int health;
//    int positionX;
//    int positionY;
    private int attackPoint;
    private boolean isAlive;
    private Sword sword;
    private Coordinate coordinate;

    public Player() {
        sword = new Sword();
        System.out.println("Hello i'm construstor");
        speak();
    }

    public Player(String name, int health, int x, int y, int attackPoint) {
        this.coordinate = new Coordinate();
        this.coordinate.x = x;
        this.coordinate.y = y;
        this.health = health;
        this.name = name;
        this.attackPoint = attackPoint;
        this.isAlive = true;
        System.out.println(this.name + " has been created!");
    }

    Player(String msg) {
        System.out.println(msg);
    }


    public void speak() {
        System.out.println("Hello! My name is " + name);
        System.out.println(value);
    }

    public void changePosition() {
        coordinate.x += calc();
        coordinate.y -= 1;
//        positionX += 1;
//        positionY -= 1;
//        System.out.println("My next position is [" + positionX + ":" + positionY + "]");
        System.out.println("My next position is [" + coordinate.x + ":" + coordinate.y + "]");
    }

    private int calc() {
        return 129;
    }

    public void takeDamage(int valueDamage) {
        health -= valueDamage;
        System.out.println(name + " has take damage is " + valueDamage + ". Player HP = " + health);
    }

    class Sword {
        String name;
        int length;
        float weight;
    }

    //Getter
    public String getName() {
        return this.name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

}
