package App.model;

import AppНомe.Tools;

/**
 * Класс участников битвы
 * Ответственный за создание класса - А.А. Дюжаков
 * Дата создания: 12.09.2021
 */

public class Fighters {

    protected String type;
    protected int healthPoint;
    protected int attackPoint;
    protected int x;
    protected int y;

    public static int number = 0;

    // Создаём конструктор для участников битвы
    public Fighters(String type) {
        this.type = type;
        number++;
    }

    // Метод получения урона
    public void decreaseHealth(int value) {
        this.healthPoint -= value;
    }

    // Метод восстановления здоровья
    public void increaseHealth(int value) {
        this.healthPoint += value;
    }

    // Метод уменьшающий силу в зависимости от здоровья
    public int decreaseAttack(int currentHealth, int currentAttack) {
        if (healthPoint > 0) {
                return (currentAttack * currentHealth / healthPoint); // Уменьшение сил врага в зависимости от % очков здоровья
            } else return (attackPoint / Tools.randomValue(10, attackPoint)); // Рандомная сила врага (от 10% до 1 очка) для возможного последнего удара
    }

    // Проверка жизни
    public boolean isPlayerAlive() {
        return healthPoint > 0;
    }

    // Гетеры на координаты
    public int getPlayerPositionX() {
        return x;
    }

    public int getPlayerPositionY() {
        return y;
    }

    // Гетеры на здоровье и силу

    public int getPlayerHealthPoint() {
        return healthPoint;
    }

    public int getPlayerAttackPoint() {
        return attackPoint;
    }
}
