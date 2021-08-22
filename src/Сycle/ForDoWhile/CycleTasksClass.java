package Сycle.ForDoWhile;

import java.util.Scanner;

/**
 * Класс для решения задач по циклам For, Do, While
 * Ответственный за создание класса - А.А. Дюжаков
 * Дата создания: 21.08.2021
 */

public class CycleTasksClass
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

/**
 * 01 Простейшие задачи на циклы - Часть 1
 * 1.1 Необходимо вывести на экран числа от 1 до 5.
 * На экране должно быть: 1 2 3 4 5
 */

        printDo(1, 5);
        System.out.println("\n");

/**
 * 1.2 Необходимо вывести на экран числа от 5 до 1.
 * На экране должно быть: 5 4 3 2 1
 */

        printDoMinus(5, 1);
        System.out.println("\n");

/**
 * 1.3 Необходимо вывести на экран таблицу умножения на 3:
 * 3*1=3
 * 3*2=6
 * 3*3=9
 * 3*4=12
 * 3*5=15
 * 3*6=18
 * 3*7=21
 * 3*8=24
 * 3*9=27
 * 3*10=30
 */

        multiplicationTable(3);
        System.out.println("\n");

/**
 * 1.4 Напишите программу,
 * где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 * Например:
 * если пользователь введет число 3.
 * Программа должна посчитать сумму чисел от 1 до 3, то есть 1+2+3
 * и выдать ответ 6.
 * если пользователь введет число 5.
 * Программа должна посчитать сумму чисел от 1 до 5, то есть 1+2+3+4+5
 * и выдать ответ 15.
 */

        System.out.print("Введите целое положительное число больше нуля: ");
        int inputNumber = scanner.nextInt();
        System.out.print("4. Сумма чисел от 1 до " + inputNumber + ": " + sumNumbers(inputNumber));
    }

    // Вывод на экран последовательности от min до max
    public static void printDo (int min, int max) {
        System.out.println("1. Вывод на экран последовательности от min=" + min + ", до max=" + max);
        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
    }

    // Вывод на экран последовательности от min до max
    public static void printDoMinus (int max, int min) {
        System.out.println("2. Вывод на экран обратной последовательности от max=" + max + ", до min=" + min);
        for (int i = max; i >= min; i--) {
            System.out.print(i + " ");
        }
    }

    // Вывод на экран таблицы умножения на n
    public static void multiplicationTable (int n) {
        System.out.println("3. Таблица умножения на " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + (n * i));
        }
    }

    // Сумма чисел от 1 до n
    public static int sumNumbers (int max) {
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        return sum;
    }
}
