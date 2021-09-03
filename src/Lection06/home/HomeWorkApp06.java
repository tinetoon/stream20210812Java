package Lection06.home;

import Lection06.home.classes.Animals;
import Lection06.home.classes.Cats;
import Lection06.home.classes.Dogs;

/**
 * Ответственный за создание класса - А.А. Дюжаков
 * Дата создания: 31.08.2021
 */

public class HomeWorkApp06 {

    public static void main(String[] args) {

        String winMessage = " Животное справилось с заданием";
        String lossMessage = " Животное не справилось";
        String eventName;
        String eventResult;

        float swimmingMaxDistanceCat = 0;
        float swimmingMaxDistanceDog = 10;
        float runningMaxDistanceCat = 200;
        float runningMaxDistanceDog = 500;

        float runCat = 155;
        float runCatBoost = 300;
        float runDog = 400;
        float swimDog = 8;

        // Параметры эстафеты
        float run = 300;
        float swim = 8;

        // Создаём животных
        Cats newCat = new Cats("Васька", swimmingMaxDistanceCat, runningMaxDistanceCat);
        Cats newHomeCat = new Cats("Мурзик", swimmingMaxDistanceCat, runningMaxDistanceCat);
        Dogs newDog = new Dogs("Шарик", swimmingMaxDistanceDog, runningMaxDistanceDog);

        Animals[] animals = {newCat, newHomeCat, newDog};

        // Задания для отдельных животных
        System.out.println(newCat.getType() + " по имени " + newCat.getName() +
                " пробежал " + newCat.run(runCat) + " метров");

        System.out.println(newHomeCat.getType() + " по имени " + newHomeCat.getName() +
                " пробежал " + newCat.run(runCatBoost) + " метров");

        System.out.println(newDog.getType() + " по имени " + newDog.getName() +
                " пробежала " + newDog.run(runDog) + " метров");
        System.out.println(newDog.getType() + " по имени " + newDog.getName() +
                " проплыла " + newDog.swim(swimDog) + " метров");

        System.out.println("Количество животных: " + Animals.numberAnimals);
        System.out.println("Количество созданных котов: " + Cats.numberCat);
        System.out.println("Количество созданных собак: " + Dogs.numberDog);

        System.out.println("===== Эстафета =====");
        for (int i = 0; i < animals.length; i++) {
            String nameString = animals[i].getType() + " " + animals[i].getName() + " может "; // Собираем первую часть строки (тип животного и его имя)

            eventName = "пробежать " + animals[i].getRunningMaxDistance() + " м. Пытается пробежать "; // Собираем событие (на сколько может бежать животное)
            eventResult = animals[i].youRun(run) ? winMessage : lossMessage; // Собираем результат события
            result(nameString, eventName, run, eventResult);

            int swimResult = animals[i].youSwim(swim);
            eventName = "проплыть " + animals[i].getSwimmingMaxDistance() + " м. Пытается проплыть ";
            eventResult = (swimResult == Animals.SWIM_OK) ? winMessage : lossMessage;
            result(nameString, eventName, swim, eventResult);
        }
    }

    // Метод выводящий в консоль результат действий животных
    public static void result(String nameAnimals, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimals + event + eventLength + resultEvent);
    }
}
