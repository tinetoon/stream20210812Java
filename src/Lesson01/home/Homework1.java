package Lesson01.home;

public class Homework1 {

    // 1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
    public static void main(String[] args) {

        printThreeWords1();

//        testMethod1();

        System.out.println("***************");

        if (checkSumSign(10, 15)) {
            System.out.println("Sum positive");
        } else {
            System.out.println("Sum negative");
        }

        System.out.println("***************");
        System.out.println("Result method with color > " + printColor(101));

        System.out.println("***************");
        System.out.println(compareNumbers(20, 15));


    }

    // 2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    public static void printThreeWords1() {
        System.out.println("_Orange\n_Banana\n_Apple");
    }

    // 3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    public static boolean checkSumSign(int a, int b) {
        return (a + b) >= 0;
    }

//    public static void testMethod1() {
//        int a = -380;
//        int b = 50;
//        int result = a + b;
//        if (result >= 0) {
//            System.out.println("Sum +");
//        } else {
//            System.out.println("Sum -");
//        }
//    }

    // 4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
// Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно),
// то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
    public static String printColor(int value) {
        if (value <= 0) {
            return "Red";
        } else if (value > 0 && value <= 100) {
            return "Yellow";
        } else {
            return "Green";
        }
    }

    // 5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
// Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
    public static String compareNumbers(int a, int b) {
        if (a >= b) {
            return "a >= b";
        } else {
            return "a < b";
        }
    }

// 6. Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают.
}

/**
 * 1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
 * 2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
 * _Orange
 * _ Banana
 * _ Apple
 * 3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
 * Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
 * то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
 * 4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
 * Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
 * если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
 * если больше 100 (100 исключительно) - “Зеленый”;
 * 5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
 * и инициализируйте их любыми значениями, которыми захотите.
 * Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
 * 6. Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают.
 */