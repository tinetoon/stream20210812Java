package Lection07.online;

import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 02.09.2021
 */

public class Class7 extends Object{

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        String string0 = "Hello_Human!";
//        String string3 = "Hello_Human1!";

//        String string1 = "Hello";
//        string1 += "_Human!";
//
//        String string2 = scanner.nextLine();
//
//        System.out.println("string0 > " + string0);
//        System.out.println("string1 > " + string1);
//        System.out.println("string2 > " + string2);
//        System.out.println("string3 > " + string3);
//
//        System.out.println("string0 = string1 > " + (string0 == string1));
//        System.out.println("string0 = string2 > " + (string0 == string2));
//        System.out.println("string0 = string3 > " + (string0 == string3));
//        System.out.println("****");
//        System.out.println("string0 = string1 > " + (string0.equals(string1)));
//        System.out.println("string0 = string2 > " + (string0.equals(string2)));
//        System.out.println("string0 = string3 > " + (string0.equals(string3)));

        String testString = "Test"; // String s1 = new String("Test");
        StringBuilder stringBuilderTest = new StringBuilder("Test");
        long startTime = System.nanoTime(); //UNIX-time

        for (int i = 0; i < 70000; i++) {
            testString += i; //Test01234565789...69999
        }

        float delta = System.nanoTime() - startTime;


        System.out.println(testString);
        System.out.println("Teststring = " + delta * 0.000001f + " millesec.");

        startTime = System.nanoTime();
        for (int i = 0; i < 70000; i++) {
            stringBuilderTest.append(i);
        }
        delta = System.nanoTime() - startTime;


        System.out.println(stringBuilderTest.toString());
        System.out.println("TestStringBuilder = " + delta * 0.000001f + " millesec.");
        System.out.println(testString.equals(stringBuilderTest.toString()));

        System.out.println("\n"); //[]
        System.out.println();
        System.out.println();

    }

}
