package www.codewars.com;

public class Multiply {
    public static void main(String[] args) {
        double a = 5;
        double b = 5;
        System.out.println("Произведение двух чисел " + a + " * " + b + " = " + multiply(a, b));


        String name = "Антон";
        int age = 39;
        System.out.printf("Имя: %s \tВозраст: %d\n", name, age);
        // Выводит в консоль следующую строку ==> Имя: Антон 	Возраст: 39
    }

    public static Double multiply(Double a, Double b) {
        return a * b;
    }
}
