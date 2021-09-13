package AppНомe.classes;

import AppНомe.Tools;

/**
 * Класс игрока
 * Ответственный за создание класса - А.А. Дюжаков
 * Дата создания: 12.09.2021
 */

public class Player extends Fighters {

//    public static char playerPoint = '@';
    private String playerName;
    private int valueMin = 20;
    private int valueMax = 30;

    public Player(String name) {
        super("Player");
        this.playerName = name;
        this.healthPoint = Tools.randomValue(valueMin, valueMax);
        this.attackPoint = Tools.randomValue(valueMin, valueMax);
    }

    // Метод передвижения игрока
    public void goPlayer(String playerMove) {
        switch (playerMove) {
                case "PLAYER_MOVE_RIGHT":
                    this.x +=1;
                    break;
                case "PLAYER_MOVE_LEFT":
                    this.x -= 1;
                    break;
                case "PLAYER_MOVE_DOWN":
                    this.y += 1;
                    break;
                case "PLAYER_MOVE_UP":
                    this.y -=1;
                    break;
            }
    }

    // Гетер на имя игрока
    public String getPlayerName() {
        return playerName;
    }
}
