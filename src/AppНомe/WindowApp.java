package AppНомe;

import App.GameWindow;

import javax.swing.*;
import java.awt.*;

/**
 * Класс для описания свойств окна
 * Ответственный за создание класса - А.А. Дюжаков
 * Дата создания: 03.09.2021
 */

public class WindowApp extends JFrame {

    private int winWidth = 1024;
    private int winHeight = 768;
    private int winPosX = 300;
    private int winPosY = 100;

    private GameMap map;
    private JPanel gui;

    private JPanel gameControlPanel;
    private JButton btnStartGame;
    private JButton btnExitGame;

    private JPanel gameInfoPanel;

    private JPanel gamePlayerPanel;

    private JPanel gameControllerPanel;

    private JPanel gameLogPanel;

    WindowApp() {

        winSetup();

        map = new GameMap(); // Создаём объект карты в виде панели

        setupGui(); // Создаём область графического интерфейса

        add(gui, BorderLayout.EAST); // Добавляем графический интерфейс в правую (восточную) часть окна
        add(map);

        setVisible(true);
    }

    // Метод сборки интерфейса
    private void setupGui() {
        gui = new JPanel();
        gui.setLayout(new GridLayout(5, 1)); // Изменяем способ размещения панелей
        setupGameControl(); // Вызываем метод создания блока с кнопками Старт/Выход
        gui.add(gameControlPanel); // Добавляем на панель интерфейса панель с кнопками
    }

    // Создаём блок запуска и выхода из игры
    private void setupGameControl() {
        gameControlPanel = new JPanel();
        gameControlPanel.setLayout(new GridLayout(3, 1));

        btnStartGame = new JButton("Запуск игры");
        btnExitGame = new JButton("Выход из игры");

        gameControlPanel.add(new JLabel("=== Меню Игры ==="));
        gameControlPanel.add(btnStartGame);
        gameControlPanel.add(btnExitGame);
    }

    private void setupGameInfo() {

    }

    private void setupPlayerInfo() {

    }

    private void setupPlayerController() {

    }

    private void setupLog() {

    }

    // Настройки окна
    private void winSetup() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(winPosX, winPosY);
        setSize(winWidth, winHeight);
        setTitle("Epic WAR");
        setResizable(false);
    }
}
