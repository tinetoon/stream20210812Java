package Lection06.home.classes;

public class Dogs extends Animals {

    public static int numberDog = 0;
    public static String typeAnimals = "Собака";

    public Dogs(String name, float swimmingMaxDistance, float runningMaxDistance) {
        super(name, typeAnimals, swimmingMaxDistance, runningMaxDistance);
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
