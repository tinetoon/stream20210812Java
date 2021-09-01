package Lection06.home;

import Lection06.home.classes.Cats;
import Lection06.home.classes.Dogs;

/**
 * Ответственный за создание класса - А.А. Дюжаков
 * Дата создания: 31.08.2021
 */

public class HomeWorkApp06 {

    public static void main(String[] args) {

        int swimmingMaxDistanceCat = 0;
        int swimmingMaxDistanceDog = 10;
        int runningMaxDistanceCat = 200;
        int runningMaxDistanceDog = 500;

        int runCat = 155;
        int runCatBoost = 300;
        int runDog = 400;
        int swimDog = 8;

        Cats newCat = new Cats("Васька", swimmingMaxDistanceCat, runningMaxDistanceCat);
        Cats newHomeCat = new Cats("Мурзик", swimmingMaxDistanceCat, runningMaxDistanceCat);
        Dogs newDog = new Dogs("Шарик", swimmingMaxDistanceDog, runningMaxDistanceDog);

        System.out.println(newCat.getType() + " по имени " + newCat.getName() +
                " пробежал " + newCat.run(runCat) + " метров");

        System.out.println(newHomeCat.getType() + " по имени " + newHomeCat.getName() +
                " пробежал " + newCat.run(runCatBoost) + " метров");

        System.out.println(newDog.getType() + " по имени " + newDog.getName() +
                " пробежала " + newDog.run(runDog) + " метров");
        System.out.println(newDog.getType() + " по имени " + newDog.getName() +
                " проплыла " + newDog.swim(swimDog) + " метров");

        System.out.println("Количество созданных котов: " + Cats.numberCat);
        System.out.println("Количество созданных собак: " + Dogs.numberDog);
    }
}
