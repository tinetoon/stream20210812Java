package Lection06.home.classes;

public class Cats extends Animals {

    public static int numberCat = 0;

    public Cats(String name, int swimmingMaxDistance, int runningMaxDistance) {
        super(name, "Кот", swimmingMaxDistance, runningMaxDistance);
        numberCat++;
    }

//    public String getType() {
//        return type;
//    }
}
