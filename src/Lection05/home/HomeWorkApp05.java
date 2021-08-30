package Lection05.home;

import Lection05.home.classes.Employee;

/**
 * Ответственный за создание класса - А.А. Дюжаков
 * Дата создания: 29.08.2021
 */

public class HomeWorkApp05 {

    public static void main(String[] args) {

/**
 * 4. Создать массив из 5 сотрудников.
  */
        Employee[] employeesProductionAndTechnicalDepartment = new Employee[5]; // Массив сотрудников ПТО

        employeesProductionAndTechnicalDepartment[0] = new Employee("Дюжаков", "Антон",
                "Александрович", "Начальник ПТО", "DyuzhakovAA@organization.com",
                "8(815-2)12-34-56", 100000, 38);
        employeesProductionAndTechnicalDepartment[1] = new Employee("Иванов", "Иван",
                "Иванович", "Инженер ПТО", "IvanovII@organization.com",
                "8(815-2)12-34-56", 50000, 61);
        employeesProductionAndTechnicalDepartment[2] = new Employee("Сергеев", "Сергей",
                "Сергеевич", "Инженер ПТО", "SergeevSS@organization.com",
                "8(815-2)12-34-56", 50000, 45);
        employeesProductionAndTechnicalDepartment[3] = new Employee("Александров", "Александр",
                "Александрович", "Инженер ПТО", "AleksandrovAA@organization.com",
                "8(815-2)12-34-56", 50000, 40);
        employeesProductionAndTechnicalDepartment[4] = new Employee("Андреев", "Андрей",
                "Андреевич", "Инженер ПТО", "AndreevAA@organization.com",
                "8(815-2)12-34-56", 50000, 30);

/**
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
  */

        for (int i = 0; i < employeesProductionAndTechnicalDepartment.length; i++) {
            if (employeesProductionAndTechnicalDepartment[i].getAge() > 40) {
                employeesProductionAndTechnicalDepartment[i].displayingInformationAboutAnEmployee();
            }
        }
    }
}
