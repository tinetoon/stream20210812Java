package Lection05.home.classes;

/**
 * Класс сотрудник
 * Ответственный за создание класса - А.А. Дюжаков
 * Дата создания: 29.08.2021
 */

public class Employee {

    // Поля: ФИО, должность, email, телефон, зарплата, возраст.
    private String surname;
    private String name;
    private String patronymic;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    // Конструктор класса Сотрудник
    public Employee(String surname, String name, String patronymic, String position, String email, String telephone,
                   int salary, int age) {
        this.surname = surname; // 1. Фамилия
        this.name = name; // 2. Имя
        this.patronymic = patronymic; // 3. Отчество
        this.position = position; // 4. Должность
        this.email = email; // 5. Электронная почта
        this.telephone = telephone; // 6. Номер телефона
        this.salary = salary; // 7. Зарплата
        this.age = age; // 8. Возраст
    }

    // Метод выводящий информацию о сотруднике в консоль
    public void displayingInformationAboutAnEmployee() {
        System.out.println("===== Карточка сотрудника =====");
        System.out.println("ФИО: " + surname +" " + name + " " + patronymic);
        System.out.println("Должность: " + position);
        System.out.println("Электронная почта: " + email);
        System.out.println("Номер телефона: " + telephone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println("===============================");
    }

    // Метод создающий геттер для поля "Возраст"
    public int getAge() {
        return age;
    }

}
