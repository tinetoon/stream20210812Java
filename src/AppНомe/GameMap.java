package AppНомe;

import javax.swing.*;
import java.awt.*;

/**
 * Класс карты
 * Ответственный за создание класса - А.А. Дюжаков
 * Дата создания: 03.09.2021
 */

public class GameMap extends JPanel {

    private WindowApp gameWindow; // Ссылка на окно, в котором происходит отрисовка окна с картой

    GameMap(WindowApp gameWindow) {
        this.gameWindow = gameWindow; // назначение переменной в данном приватном классе окна отрисовки с класса WindowApp
        setBackground(Color.black);
    }

    // Метод старта игры на карте по команде с кнопки "Старт"
    void startGame() {
        gameWindow.writeLogs("Start Game");
    }
}
