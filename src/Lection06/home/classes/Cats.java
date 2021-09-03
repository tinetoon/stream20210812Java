package Lection06.home.classes;

public class Cats extends Animals {

    public static int numberCat = 0;
    public static String typeAnimals = "Кот";

    public Cats(String name, float swimmingMaxDistance, float runningMaxDistance) {
        super(name, typeAnimals, swimmingMaxDistance, runningMaxDistance);
        numberCat++;
    }

    // Метод возвращающий результат выполнения команды "Плыть"
    @Override
    public int youSwim(float distance) {
        return Animals.SWIM_NONE; // Переопределение вывода для кота, который не умеет плавать
    }

}
