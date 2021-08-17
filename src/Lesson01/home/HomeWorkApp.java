package Lesson01.home;

/**
 * Ответственный за создание класса - А.А. Дюжаков
 * Дата создания: 14.08.2021
 */

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 2021; //Текущий год
        int b = -1982; //Год рождения
        int result = a + b; //Количество лет, исполняемых в текущем году
//        System.out.println("Результат сложения переменных a и b = " + result);

        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 13;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 2021; //Текущий год
        int b = -1982; //Год рождения

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
