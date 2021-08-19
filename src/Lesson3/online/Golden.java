package Lesson3.online;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 19.08.2021
 */

public class Golden {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {

//        System.out.println("Result " + randomValueRange(5,20));

//        for (int i = 0; i < 5; i++) {
//            System.out.println(randomiZator(10));
//        }

//        for (int i = 0; i < 5; i++) {
//            System.out.println(random.nextInt()); //[-int;+int]
//            System.out.println(random.nextFloat()); //[0;1)
//            System.out.println(random.nextDouble()); //[0;1)
//            System.out.println(random.nextInt(100)); // [0;100)
//            System.out.println(random.nextInt(-100)); // [0;100) - NOT WORK!!!!
//            System.out.print(randomValueRange(5,20) + " ");
//            System.out.print(randomValueRange(-40,-20) + " ");
//            System.out.print(randomValueRange(-5,-10) + " "); - NOT WORK!!!
//        }
//        System.out.println("Hello " + saveInputUserName("Enter your username"));

//        int value = saveInputUserValue("Enter your custom value");
//        System.out.println("Result = " + (value * 2));
//        greetingUser("Boris");
//        greetingUser("Boris", "Anatoljevich");
//        greetingUser("Boris", "Anatoljevich", "Pupkin");
//        byte[] myByteArray = new byte[4];
//        myByteArray[0] = 15;
//        myByteArray[1] = 10;
//        myByteArray[2] = 75;
//        myByteArray[3] = 13;

//        System.out.println(myByteArray[2] + " > " + myByteArray[0]);

//        int[] arrayTest1 = new int[199];
//
//        for (int i = 0; i < arrayTest1.length; i++) {
//            arrayTest1[i] = randomValueRange(10, 30);
//        }
//
//        for (int i = 0; i < arrayTest1.length; i++) {
//            System.out.print(arrayTest1[i] + " ");
//        }

//        String[] box1 = new String[15];
//        String[] box2 = new String[7];
//
//        fillStringArray(box1);
//        fillStringArray(box2);
//
//        readArray(box1);
//        readArray(box2);

//        int[] abc = new int[5];
//        abc[0] = 15;

//        readArray(abc);

//        String[] myCustomArray = {"Boris", "Anna", "Alex"};
//        readArray(myCustomArray);

//       int[][] arrayTest2 = new int[5][5];
//        arrayTest2[3][2] = 16;
//        arrayTest2[0][0] = 27;

//        printArray2(2, 3);
//
//        int[][] abc = new int[1][1];
//
//        String[][] testTable = new String[3][];
//        testTable[0] = new String[11];
//        testTable[1] = new String[15];
//        testTable[2] = new String[3];
//
//        for (int y = 0; y < testTable.length; y++) {
//            for (int x = 0; x < testTable[y].length; x++) {
//                System.out.print(testTable[y][x] + "\t");
//            }
//            System.out.println();
//        }

    }


    public static void printArray2(int height, int width) {
        String[][] table = new String[height][width];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                table[y][x] = "[" + y + ";" + x + "]";
            }
        }

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                System.out.print(table[y][x] + "\t");
            }
            System.out.println();
        }

    }

    public static void fillStringArray(String[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = randomiZator(5);
        }
    }

    public static void readArray(String[] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + "\t");
        }
        System.out.println();
    }

    public static void readArray(int[] inputArray){
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + "\t");
        }
        System.out.println();
    }


//    public static void greetingUser(String name) {
//        System.out.println("Hello " + name);
//    }
//
//    public static void greetingUser(String name, String secName) {
//        System.out.println("Hello " + name + " " + secName);
//    }
//
//    public static void greetingUser(String name, String secName, String surname) {
//        System.out.println("Hello " + name + " " + secName + " " + surname);
//    }
//
//    public static void method1(int value, String secName) {
//        System.out.println("Hello " + value + " " + secName);
//    }
//
//    public static void method1(String secName, int value) {
//        System.out.println("Hello " + value + " " + secName);
//    }
//
    public static int randomValueRange(int min, int max) {
        int tmp = max - min;
        int value = random.nextInt(tmp + 1);
        return min + value;
    }

    public static String randomiZator(int valueChars) {
        String tmp = "";

        for (int i = 0; i < valueChars; i++) {
            int valueAscii = randomValueRange(48, 122);
            char tmpChar = (char) valueAscii;
            tmp += tmpChar;
        }

        return tmp;

    }

//    public static String saveInputUserName(String msg) {
//        System.out.print(msg + " > ");
//        return scanner.next();
//    }
//
//    public static int saveInputUserValue(String msg) {
//        System.out.print(msg + " > ");
//        return scanner.nextInt();
//    }


}
