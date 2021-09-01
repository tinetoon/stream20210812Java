package Lection06.home.classes;

public class Dogs extends Animals {

    public static int numberDog = 0;

    public Dogs(String name, int swimmingMaxDistance, int runningMaxDistance) {
        super(name, "Собака", swimmingMaxDistance, runningMaxDistance);
        numberDog++;
    }

//    public String getName() {
//        return this.name;
//    }
//
//    public String getType() {
//        return type;
//    }
}
