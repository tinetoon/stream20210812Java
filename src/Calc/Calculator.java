package Calc;

import java.util.Scanner;

public class Calculator {

    private static Double x;
    private static Double y;
    private static char inf = '\u221E';
    private static Double result;
    private static Scanner consoleInput;

    public static void main(String[] args) {

        // Инициализируем сканер коннсольным вводом
        consoleInput = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        x = consoleInput.nextDouble();
        System.out.print("Введите второе число: ");
        y = consoleInput.nextDouble();
        System.out.println("====== Результаты математических операций ======");
        System.out.println("X + Y = " + (x + y));
        System.out.println("X - Y = " + (x - y));
        System.out.println("X * Y = " + (x * y));
        if (y == 0) {
            if (x < 0) {
                System.out.println("X / Y = -" + inf);
            } else {
                if (x == 0) {
                    System.out.println("X / Y = н/а");
                } else {
                    System.out.println("X / Y = " + inf);
                }
            }
        }  else {
            System.out.println("X / Y = " + (x / y));
        }
    }
}
