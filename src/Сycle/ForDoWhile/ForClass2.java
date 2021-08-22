package Сycle.ForDoWhile;

/**
 * Класс для изучения циклов For, Do, While
 * Ответственный за создание класса - А.А. Дюжаков
 * Дата создания: 22.08.2021
 */

public class ForClass2 {

    public static void main(String[] args) {

/**
 * 02 Простейшие задачи на циклы - Часть 2
 * 2.1 Необходимо, чтоб программа выводила на экран вот такую последовательность:
 * 7 14 21 28 35 42 49 56 63 70 77 84 91 98
 */

        forCyclePlus1();
        System.out.println("\n");
        forCyclePlus2();
        System.out.println("\n");
        doCyclePlus3();
        System.out.println("\n");

/**
 * 2.2 Необходимо вывести на консоль такую последовательность чисел:
 * 1 2 4 8 16 32 64 128 256 512
 */

        wileCyclePlus();
        System.out.println("\n");
    }

    // 1.1 Цикл For с инкриментацией (приращением)
    public static void forCyclePlus1() {
        System.out.println("1.1 Цикл For с инкриментацией (приращением)");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
    }

    // 1.2 Цикл Do/while с инкриментацией (приращением)
    public static void forCyclePlus2() {
        System.out.println("1.2 Цикл Do/while с инкриментацией (приращением)");
        int i = 7;
        do {
            System.out.print(i + "\t");
            i += 7;
        } while (i <= 98);
    }

    // 1.3 Цикл Do/while, continue/break с инкриментацией (приращением)
    public static void doCyclePlus3() {
        System.out.println("1.3 Цикл Do/while, continue/break с инкриментацией (приращением)");
        int i = 0;
        do {
            i += 7;
            if (i == 14 | i == 28 | i == 42 | i == 56 | i == 70 | i == 84) {
                continue;
            }
            if (i == 98) break;
            System.out.print(i + "   \t");
        } while (i < 98);
    }

    // 1.4 Цикл while с инкриментацией (приращением)
    public static void wileCyclePlus () {
        System.out.println("1.4 Цикл while с инкриментацией (приращением)");
        int i = 1;
        while (i <= 512) {
            System.out.print(i + " ");
            i *= 2; // i = i * 2;
        }
    }

}