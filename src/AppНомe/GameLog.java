package AppНомe;

import javax.swing.*;
import java.awt.*;

/**
 * Класс вывода информации о событиях
 * Ответственный за создание класса - А.А. Дюжаков
 * Дата создания: 03.09.2021
 */

public class GameLog extends JScrollPane {

    private JScrollPane gameLogScrollPanel;
    private JTextArea gameLog;

    // Конструктор для создания панели с полем для информационных сообщений
    GameLog() {
        gameLog = new JTextArea();
        gameLogScrollPanel = new JScrollPane(gameLog);

        gameLog.setEditable(false);
        gameLog.setLineWrap(true);
        // Необходимо установить цвет фона отличный от белого
//        gameLog.setBackground(Color.darkGray);
//        gameLogScrollPanel.setBackground(Color.darkGray);
    }

    // Метод позволяющий отправлять в Лог записи
    public void writeLogs(String msg) {
        gameLog.append(msg + "\n");
    }
}
