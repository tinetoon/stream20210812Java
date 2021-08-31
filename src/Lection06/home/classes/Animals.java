package Lection06.home.classes;

/**
 * Класс Животные
 * Ответственный за создание класса - А.А. Дюжаков
 * Дата создания: 31.08.2021
 */

public class Animals {

    protected String name;
    protected int swimmingDistance;
    protected int swimmingMaxDistance;
    protected int runningDistance;
    protected int runningMaxDistance;

    // Создаём конструктор для животного
    public Animals(String name, int swimmingMaxDistance, int runningMaxDistance) {
        this.name = name;
        this.swimmingMaxDistance = swimmingMaxDistance;
        this.runningMaxDistance = runningMaxDistance;
    }

    // Метод возвращающий, какую дистанцию проплыло животное
    public int swim(int swimmingDistance) {
        if (swimmingDistance <= swimmingMaxDistance) {
            return swimmingDistance;
        } else {
            printSwimmingError();
            return swimmingMaxDistance;
        }
    }

    // Метод возвращающий, какую дистанцию пробежало животное
    public int run(int runningDistance) {
        if (runningDistance <= runningMaxDistance) {
            return runningDistance;
        } else {
            printRunningError(runningMaxDistance);
            return runningMaxDistance;
        }
    }

    // Метод возвращающий ошибку при попытке проплыть дистанцию, превышающую возможности животного
    public static void printSwimmingError() {
        System.out.println("Ваше животное утонуло, попробуйте преодолеть меньшую дистанцию");
    }

    // Метод возвращающий ошибку при попытке пробежать дистанцию, превышающую возможности животного
    public static void printRunningError(int runningMaxDistance) {
        System.out.println("Ваше животное пробежало только " + runningMaxDistance +
                ", попробуйте преодолеть дистанцию за несколько раз");
    }
}
