package Сycle.ForDoWhile;

/**
 * Класс для изучения циклов For, Do, While
 * Ответственный за создание класса - А.А. Дюжаков
 * Дата создания: 21.08.2021
 */

public class ForClass {

    public static void main(String[] args) {

        forCyclePlus1();
        System.out.println("\n");

        forCyclePlus2();
        System.out.println("\n");

        forCyclePlusBreak();
        System.out.println("\n");

        forCycleMinus();
        System.out.println("\n");

        doCyclePlus();
        System.out.println("\n");

        whileCycleMinus();
        System.out.println("\n");
    }

    // 1.1 Цикл For с инкриментацией (приращением)
    public static void forCyclePlus1 () {
        System.out.println("1.1 Цикл For с инкриментацией (приращением)");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    // 1.2 Цикл For с инкриментацией (приращением)
    public static void forCyclePlus2 () {
        System.out.println("1.2 Цикл For с инкриментацией (приращением)");
        for (int i = 1; i <= 10; i++) System.out.print(i + " "); // При единичном действии {} можно опустить
    }

    // 1.3 Пример работы операторов break и continue в цикле For
    public static void forCyclePlusBreak () {
        System.out.println("1.3 Пример работы операторов break и continue в цикле For");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 5) break;
        }
    }

    // 2. Цикл For с дикриментацией (убыванием)
    public static void forCycleMinus () {
        System.out.println("2. Цикл For с дикриментацией (убыванием)");
        for (int i = 10; i >= 1 ; i--) {
            System.out.print(i + " ");
        }
    }

    // 3. Цикл Do с инкриментацией (приращением)
    public static void doCyclePlus () {
        int i = 1;
        System.out.println("3. Цикл Do с инкриментацией (приращением)");
        do {
            System.out.print(i + " ");
            i++;
        }
        while (i <= 10); // Цикл Do выполняется минимум один раз, даже если условие в While ложно
    }

    // 4. Цикл While с дикриментацией (убыванием)
    public static void whileCycleMinus () {
        int i = 10;
        System.out.println("4. Цикл While с дикриментацией (убыванием)");
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
    }
}
