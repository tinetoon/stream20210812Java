package Lesson02.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 16.08.2021
 */

public class GoodClass2 {

    public static int valueFromClass = 10;

    public static void main(String[] args) {

        System.out.println(work1(100));

//        System.out.println("Hello 1");
//        System.out.println("Hello 2");
//        System.out.println("Hello 3");
//        //...
//        System.out.println("Hello 10");

//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Hello " + i);
//        }

//        System.out.println("Result myMath = " + myMath(2, 10));

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 5; j++) {
//
//            }
//        }

//        table(10,10);

//        int a = 0;
//
//        while (a < 10) {
//            a++;
//            if (a == 5) continue;
//            if (a == 7) break;
//            System.out.print(a + " ");
//        }

//        int b = 0;
//
//        do {
//            b++;
//            System.out.print(b + " ");
//        } while (b < 10);




//        doSomething("POkjhnsdlkjfhblkj"); // -> BAD CODE!!!!
//        studySwitch();
//        System.out.println(valueFromClass);
//        int valueFromMethod = 11;
//
//        System.out.println(valueFromMethod);

//        ternarOperation();
    }

    public static String work1(int value) {
        if (value <= 100 && value >= 999) {
            return "Error: " + value + " is bad value";
        }
        return "result = " + (value % 10) + ((value % 100) / 10) + (value / 100);
    }

    public static void table(int width, int height) {
        for (int y = 1; y < height; y++) {
            for (int x = 1; x < width; x++) {
                System.out.print(y * x + "\t");
            }
            System.out.println();
        }
    }

    public static int myMath(int base, int signature) {
        if (signature == 0) {
            return 1;
        }
        int result = base;

       for (int i = 1; i <= signature - 1; i++) {

            result = result * base;
        }
        return result;
    }

    public static void ternarOperation() {
        int a = 10;
        int b = 20;
        int c;

        if (a > b) {
            c = a;
        } else {
            c = b;
        }

        c = (a > b) ? a : b; // тернарный оператор

        if (a > b) {
            c = doSomething1();
        } else {
            c = doSomething2();
        }

        c = (a > b) ? doSomething1() : doSomething2();

        System.out.println("Result C > " + c);
    }

    public static void studySwitch() {
        System.out.println(valueFromClass);
//        System.out.println(valueFromMethod);
        String nameLetter = "Qwerty";

        if (nameLetter == "Boris") {
            System.out.println("Send letter to Boris");
        } else if (nameLetter == "Olga") {
            System.out.println("Send letter to Olga");
        } else if (nameLetter == "Maria") {
            System.out.println("Send letter to Maria");
        } else if (nameLetter == "Alex") {
            System.out.println("Send letter to Alex");
        } else {
            System.out.println("Go out office");
        }

        System.out.println("***********************************");

        switch (nameLetter) { //Olga
            case "Boris": //if (nameLetter == "Boris") {
                System.out.println("Send letter to Boris");
                break;
            case "Olga":
                System.out.println("Send letter to Olga");
                System.out.println("Send letter to Olga");
                break;
            case "Maria":
                System.out.println("Send letter to Maria");
                break;
            case "Alex":
                System.out.println("Send letter to Alex");
                break;
            default:
                System.out.println("Go out office");
                break;
        }
    }

    public static int doSomething1() {
        ///...
        return 50;
    }

    public static int doSomething2() {
        ///...
        return 99;
    }

//    public static void doSomething(String msg) { // -> BAD CODE!!!!
//        System.out.println(msg + " Hello"); // -> BAD CODE!!!!
//    } // -> BAD CODE!!!!
}
