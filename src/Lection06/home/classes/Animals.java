package Lection06.home.classes;

/**
 * Класс Животные
 * Ответственный за создание класса - А.А. Дюжаков
 * Дата создания: 31.08.2021
 */

public abstract class Animals {

    public static final int SWIM_FAIL = 0;
    public static final int SWIM_OK = 1;
    public static final int SWIM_NONE = -1;

    protected String name;
    private String type;
    private float swimmingMaxDistance;
    private float runningMaxDistance;

    public static int numberAnimals = 0;

    // Создаём конструктор для животного
    public Animals(String name, String type, float swimmingMaxDistance, float runningMaxDistance) {
        this.name = name;
        this.type = type;
        this.swimmingMaxDistance = swimmingMaxDistance;
        this.runningMaxDistance = runningMaxDistance;
        numberAnimals++;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return type;
    }

    public float getSwimmingMaxDistance() {
        return this.swimmingMaxDistance;
    }

    public float getRunningMaxDistance() {
        return this.runningMaxDistance;
    }

    // Метод возвращающий, какую дистанцию проплыло животное
    public float swim(float swimmingDistance) {
        if (swimmingDistance <= swimmingMaxDistance) {
            return swimmingDistance;
        } else {
            printSwimmingError();
            return swimmingMaxDistance;
        }
    }

    // Метод возвращающий, какую дистанцию пробежало животное
    public float run(float runningDistance) {
        if (runningDistance <= runningMaxDistance) {
            return runningDistance;
        } else {
            printRunningError(runningMaxDistance);
            return runningMaxDistance;
        }
    }

    // Метод возвращающий результат выполнения команды "Бежать"
    public boolean youRun(float distance) {
        return (distance <= runningMaxDistance);
    }

    // Метод возвращающий результат выполнения команды "Плыть"
    public int youSwim(float distance) {
        return (distance <= swimmingMaxDistance) ? SWIM_OK : SWIM_FAIL; // Тернарный оператор: Если (true) ?(то) SWIM_OK :(иначе) SWIM_FAIL
    }

    // Метод возвращающий ошибку при попытке проплыть дистанцию, превышающую возможности животного
    protected static void printSwimmingError() {
        System.out.println("Ваше животное утонуло, попробуйте преодолеть меньшую дистанцию");
    }

    // Метод возвращающий ошибку при попытке пробежать дистанцию, превышающую возможности животного
    protected static void printRunningError(float runningMaxDistance) {
        System.out.println("Ваше животное пробежало только " + runningMaxDistance +
                ", попробуйте преодолеть дистанцию за несколько раз");
    }
}
