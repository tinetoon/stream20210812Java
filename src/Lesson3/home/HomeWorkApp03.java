package Lesson3.home;

import java.util.Random;

/**
 * Ответственный за создание класса - А.А. Дюжаков
 * Дата создания: 20.08.2021
 */

public class HomeWorkApp03 {

    public static Random random = new Random(); // Объявим новый класс Random

    public static void main(String[] args) {

/**
 * 1.1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 * 1.2 С помощью цикла и условия заменить 0 на 1, 1 на 0;
*/
        int[] intArray01 = new int[10]; // Объявляем массив из 10 элементов
        fillArray(intArray01, 0, 1); // Инициализируем массив случайными числами, аргументы: (имя массива, диапазон случайных чисел)
        System.out.print("1.1 Массив заполненный случайными числами: \t\t");
        printArray(intArray01);

//        for (int i = 0; i < intArray01.length; i++) {
//            if (intArray01[i] == 0) {
//                intArray01[i] = 1;
//            } else intArray01[i] = 0;
//        }

        System.out.print("1.2 Массив замены значений на противоположные: \t");
        printArray(replacement(intArray01));
        System.out.println();

/**
 * 2. Задать пустой целочисленный массив длиной 100.
 * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
 */

        int[] array100 = new int[100]; // 2.1 Объявляем массив из 100 элементов
//        for (int i = 0; i < array100.length; i++) {
//            array100[i] = (i + 1);
//        }
        creatingArrayFromOneToMax(array100, 100);
        System.out.println("2.1 Элементы массива: " + array100[0] + ", " + array100[1] + " ... " + array100[99]);
        System.out.println();

/**
 * 3.1 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
 * 3.2 Пройти по нему циклом, и числа меньшие 6 умножить на 2;
 */

        int[] arrayMultiplication = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("3.1 Созданный массив: \t");
        printArray(arrayMultiplication);
//        for (int i = 0; i < arrayMultiplication.length; i++) {
//            if (arrayMultiplication[i] < 6) {
//                arrayMultiplication[i] = arrayMultiplication[i] * 2;
//            }
//        }
        multiplicationByTwoElementsLessThanSix(arrayMultiplication);
        System.out.print("3.2 Умноженный массив: \t");
        printArray(arrayMultiplication);
        System.out.println();

/**
 * 4.1 Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * 4.2 С помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * 4.3 Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 */

        int[][] arrayCube = new int[5][5]; // Объявляем массив из 5x5 элементов
        System.out.println("4.1.1 Размер массива: " + arrayCube.length + "х" + arrayCube[arrayCube.length - 1].length);
//        for (int j = 0; j < arrayCube.length; j++) {
//            for (int i = 0; i < arrayCube[arrayCube.length - 1].length; i++) {
//                if (i == j | (i == (arrayCube.length - 1 - j))) {
//                    arrayCube[j][i] = 1;
//                }
//            }
//        }
        fillingInTheDiagonals(arrayCube);
        System.out.println("4.1.2 Массив:");
        printDoubleArray(arrayCube);
        System.out.println();

/**
 * 5.1 Написать метод, принимающий на вход два аргумента: len и initialValue,
 * 5.2 И возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
 */

        System.out.print("5. Возврат массива: ");
        printArray(initialValueArray(5, 7));
        System.out.println();

/**
 * 6.1 Задать одномерный массив
 * 6.2 И найти в нем минимальный и максимальный элементы
 */

        int len = 10; // Длина массива
        int minValue = 0; // Минимальное значение элемента массива
        int maxValue = 100; // Максимальное значение элемента массива

        int[] arrayMinMax = new int[len]; // Объявляем массив из len элементов
        fillArray(arrayMinMax, minValue, maxValue); // Инициализируем массив случайными числами
        System.out.print("6.1 Массив заполненный случайными числами: \t");
        printArray(arrayMinMax);
        findMinAndMax(arrayMinMax, minValue, maxValue);
//        int min = maxValue;
//        int max = minValue;
//        for (int i = 0; i < arrayMinMax.length; i++) {
//            if (min > arrayMinMax[i]) {
//                min = arrayMinMax[i];
//            } if (max < arrayMinMax[i]) {
//                max = arrayMinMax[i];
//            }
//        }
//
//        System.out.println("6.2.1 Минимальное значение: \t" + min);
//        System.out.println("6.2.2 Максимальное значение: \t" + max);
        System.out.println();

/**
 * 7.1 ** Написать метод, в который передается не пустой одномерный целочисленный массив,
 * 7.2 метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
 * **Примеры:
 * checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
 * checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
 * checkBalance([1, 1, 1, 1, 1, 1, 4 ||| 10]) → true, т.е. 1 + 1 + 1 = 2 + 1
 * checkBalance([1, 1, 10]) → false
 * граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
 */

        int[] arraySumView = new int[5];
        fillArray(arraySumView, 0, 1);
        System.out.print("7.1 Массив:\t");
        printArray(arraySumView);
        System.out.println();
        System.out.println("7.2.3 Сумма левой и правой частей массива равна: " + arraySumCheck(arraySumView));

/** Код для теста методов седьмого задания:
        int[] arraySumViewTest = {1, 1, 1, 0, 0, 0, 3};
        System.out.print("7.1.1 Массив:\t");
        printArray(arraySumViewTest);
        int maxElArray = arraySumViewTest.length;
        System.out.println("7.1.2 Длина массива: " + maxElArray);
        System.out.println("7.1.3 Номер последнего элемента массива: " + (arraySumViewTest.length - 1));
        System.out.println("7.1.4 Сумма элемента массива с 0 до max: " + sumOfElementsArray(arraySumViewTest, 0, maxElArray));
        System.out.println("7.1.5 Сумма элемента массива с 0 до 0: " + sumOfElementsArray(arraySumViewTest, 0, 0));
        System.out.println("7.1.6 Сумма элемента массива с 1 до max: " + sumOfElementsArray(arraySumViewTest, 1, maxElArray));
        System.out.println("7.1.7 Сумма элемента массива с max до max: " + sumOfElementsArray(arraySumViewTest, maxElArray, maxElArray));
        System.out.println("7.3 Сумма левой и правой частей массива равна: " + arraySumCheck(arraySumViewTest));
 */

    }

//    // Сумма элементов одномерного массива
    public static int sumOfElementsArray(int[] inputArray, int start, int and) {
        int sum = 0;
        if (start == 0 & and == 0) {
            sum = inputArray[0];
        } else if (start != 0 & start == and) {
            sum = inputArray[inputArray.length - 1];
        }
        for (int i = start; i < and; i++) sum += inputArray[i];
        return sum;
    }

//    // Проверка суммы правых и левых элементов одномерного массива
    public static boolean arraySumCheck(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            int sumLeft = sumOfElementsArray(inputArray, 0, i);
//            System.out.println("Шаг № " + i + " 7.2.1 Сумма левой части массива равна:\t" + sumLeft);
            int sumRight = sumOfElementsArray(inputArray, i + 1, inputArray.length);
//            System.out.println("Шаг № " + i + " 7.2.2 Сумма правой части массива равна:\t" + sumRight);
//            System.out.println();
            if (sumLeft != sumRight) {
                continue;
            } else {
                System.out.println("7.2.1 Сумма левой части массива равна (" + "шаг № " + i + "):\t" + sumLeft);
                System.out.println("7.2.2 Сумма правой части массива равна (" + "шаг № " + i + "):\t" + sumRight);
                return true;
            }
        }

        return false;
    }

    // Генератор целых случайных чисел в диапазоне от min (включительно) до max (включительно)
    public static int randomNumberRange(int min, int max) {
        int randomNumber = random.nextInt((max - min) + 1);
        return min + randomNumber;
    }

    // Метод для создания одномерного массива из случайных целых чисел
    public static void fillArray(int[] inputArray, int min, int max) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = randomNumberRange(min, max);
        }
    }

    // Метод для возвращающий одномерный массив длиной len целых чисел initialValue
    public static int[] initialValueArray (int len, int initialValue) {
        int[] arrayInValue = new int[len]; // Объявляем массив длиной len
        for (int i = 0; i < len; i++) {
            arrayInValue[i] = initialValue;
        } return arrayInValue;
    }

    // Метод для вывода одномерного массива в консоль
    public static void printArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + "\t");
        }
        System.out.println();
    }

    // Метод для вывода двумерного массива в консоль
    public static void printDoubleArray(int[][] inputArray) {
        for (int y = 0; y < inputArray.length; y++) {
            for (int x = 0; x < inputArray[inputArray.length - 1].length; x++) {
                System.out.print(inputArray[y][x] + "\t");
            }
            System.out.println();
        }
    }


    // Метод для замены 1 на 0 и наоборот
    public static int[] replacement (int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 0) {
                inputArray[i] = 1;
            } else inputArray[i] = 0;
        } return inputArray;
    }

    // Метод для создания массива, заполненного последовательными элементами
    public static int[] creatingArrayFromOneToMax (int[] inputArray, int max) {
//        inputArray = new int[max]; // Объявляем массив из max элементов
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = (i + 1);
        } return inputArray;
    }

    // Метод для умножения элементов массива меньше шести на два
    public static void multiplicationByTwoElementsLessThanSix (int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < 6) {
                inputArray[i] = inputArray[i] * 2;
            }
        }
    }

    // Метод для заполнения диагоналей
    public static void fillingInTheDiagonals (int[][] inputArray) {
        for (int j = 0; j < inputArray.length; j++) {
            for (int i = 0; i < inputArray[inputArray.length - 1].length; i++) {
                if (i == j | (i == (inputArray.length - 1 - j))) {
                    inputArray[j][i] = 1;
                }
            }
        }
    }

    // Метод для нахождения максимального и минимального элементов массива
    public static void findMinAndMax (int[] inputArray, int minValue, int maxValue) {
        int min = maxValue;
        int max = minValue;
        for (int i = 0; i < inputArray.length; i++) {
            if (min > inputArray[i]) {
                min = inputArray[i];
            } if (max < inputArray[i]) {
                max = inputArray[i];
            }
        }

        System.out.println("6.2.1 Минимальное значение: \t" + min);
        System.out.println("6.2.2 Максимальное значение: \t" + max);
    }

}
