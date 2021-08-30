package Lection06.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 30.08.2021
 */

public class Dragon extends Enemy {

    public Dragon (String name, int health, int attackPoint, int positionX, int positionY, float dexterity) {
        super(name, health, attackPoint, positionX, positionY, dexterity);
        System.out.println("This is constructor Dragon");
    }

    @Override
    public void escape() {
        super.escape();
        super.attack();
        super.takeDamage(15);
        System.out.println("FIRE!");
    }

    public void fly(){
        System.out.println(name + " fly");
    }

}
