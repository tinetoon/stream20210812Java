package AppНомe.classes;

import AppНомe.Tools;

/**
 * Класс врагов
 * Ответственный за создание класса - А.А. Дюжаков
 * Дата создания: 12.09.2021
 */

public class Monster extends Fighters {

    private int valueMin = 50;
    private int valueMax = 80;

    public static int number = 0;

    public Monster()  {
        super("Monster");
        this.healthPoint = Tools.randomValue(valueMin, valueMax);
        this.attackPoint = Tools.randomValue(valueMin, valueMax);
        number++;
    }
}
