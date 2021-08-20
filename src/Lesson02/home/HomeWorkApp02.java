package Lesson02.home;

/**
 * Ответственный за создание класса - А.А. Дюжаков
 * Дата создания: 18.08.2021
 */

public class HomeWorkApp02 {

    public static void main(String[] args) {

//      Выполним Метод № 1
        System.out.println("Результат Метода № 1: " + checkSum(7, 2)); // Выведем в консоль результат отработки Метода № 1

//      Выполним Метод № 2
        int checkNumber = -13; //Объявим переменную целого типа и инициализируем её любым значением, для последующей проверки
        positiveOrNegativeСheck(checkNumber);

//      Выполним Метод № 3
        boolean checkNumberResult = positiveOrNegativeСheckReturn(checkNumber); // Объявим переменную и инициализируем её значением, возвращаемым Методом № 3
        System.out.println("Результат Метода № 3: " + checkNumberResult); // Выведем в консоль результат отработки Метода № 3

//      Выполним Метод № 4
        printString("- cтрока № ", 5);

//      Выполним Метод № 5
        double year = 2021; // Объявим переменную и инициализируем её значением года больше нуля
        boolean checkYearResult = checkOfTheYear(year);
        System.out.println("Результат Метода № 5: " + checkYearResult);
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
     * в противном случае – false.
     */
    public static boolean checkSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    /**
     * 2. Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
     * Замечание: ноль считаем положительным числом.
     */
    public static void positiveOrNegativeСheck(int a) {
        if (a >= 0) {
            System.out.println("Результат Метода № 2: Число положительное");
        } else {
            System.out.println("Результат Метода № 2: Число отрицательное");
        }
    }

    /**
     * 3. Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное,
     * и вернуть false если положительное.
     */
    public static boolean positiveOrNegativeСheckReturn(int a) {
        return a < 0;
    }

    /**
     * 4. Написать метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */
    public static void printString(String a, int b) {

        System.out.println("Результат Метода № 4:");

        for (int i = 1; i <= b; i++) {
            System.out.println(a + i);
        }
    }

    /**
     * 5.* Написать метод, который определяет, является ли год високосным,
     * и возвращает boolean (високосный - true, не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    public static boolean checkOfTheYear(double a) {
        return (((a % 400) == 0) | ((a % 4) == 0 & (a % 100) != 0));
    }

//        Вариант № 1
//        if ((a % 400) == 0) {
//            return true;
//        } else if ((a % 4) == 0 & (a % 100) != 0) {
//            return true;
//        } else return a != 0; // Данную конструкцию используем взамен вложенных ветвлений
//        } else if (a != 0) {
//            return true;
//        } else {
//            return false;
//        }

//        Вариант № 2
//        if ((a % 400) == 0) {
//            return true;
//        } else if ((a % 4) == 0 & (a % 100) != 0) {
//            return true;
//        } else return a != 0; // Данную конструкцию используем взамен вложенных ветвлений
//    }
}
