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
    private JLabel playerName;
    private JLabel mapSize;
    private JLabel countMonster;

    private JPanel gamePlayerPanel;
    private JLabel playerHealthPoint;
    private JLabel playerAttackPoint;

    private JPanel gameMonsterPanel;
    private JLabel monsterHealthPoint;
    private JLabel monsterAttackPoint;

    private JPanel playerControllerPanel;
    private JPanel playerCenterPanel;
    private JButton btnLeft;
    private JButton btnUp;
    private JButton btnDown;
    private JButton btnRight;

    private JScrollPane gameLogScrollPanel; // Панель с полями прокрутки (scroll) взамен обычного поля
    private JTextArea gameLog; // Текстовое поле на панели лога игры

    // Конструктор метода окна приложения
    WindowApp() {

        setupWin(); // Собираем интерфейс из блоков
        map = new GameMap(); // Создаём объект карты в виде панели
        setupGui(); // Создаём область графического интерфейса
        add(gui, BorderLayout.EAST); // Добавляем графический интерфейс в правую (восточную) часть окна
        add(map); // Добавляем панель карты на оставшуюся часть окна
        setVisible(true); // Делаем окно видимым
    }

    // Метод сборки интерфейса
    private void setupGui() {
        gui = new JPanel(); // Создаём новую панель для графического интерфейса
        gui.setLayout(new GridLayout(6, 1)); // Изменяем способ размещения панелей

        setupGameControl(); // 1. Вызываем метод создания блока с кнопками Старт/Выход
        setupGameInfo(); // 2. Вызываем метод создания блока с информацией об игре
        setupPlayerInfo(); // 3. Вызываем метод создания блока с информацией об игроке
        setupMonsterInfo(); // 4. Вызываем метод создания блока с информацией о врагах
        setupPlayerController(); // 5. Вызываем метод создания блока с кнопками управления игроком
        setupGameLog(); // 6. Вызываем метод создания блока с информационными сообщениями

        gui.add(gameControlPanel); // 1. Добавляем на панель интерфейса панель с кнопками
        gui.add(gameInfoPanel); // 2. Добавляем на панель интерфейса панель с информацией об игре
        gui.add(gamePlayerPanel); // 3. Добавляем на панель интерфейса панель с информацией об игроке
        gui.add(gameMonsterPanel); // 4. Добавляем на панель интерфейса панель с информацией о врагах
        gui.add(playerControllerPanel); // 5. Добавляем на панель интерфейса панель с кнопками управления игроком
        gui.add(gameLogScrollPanel, BorderLayout.SOUTH); // 6. Добавляем на панель интерфейса панель с информационными сообщениями
    }

    // 1. Создаём блок кнопок запуска и выхода из игры
    private void setupGameControl() {
        gameControlPanel = new JPanel();
        gameControlPanel.setLayout(new GridLayout(1, 1)); // Располагаем кнопки в одну строку

        btnStartGame = new JButton("Запуск игры");
        btnExitGame = new JButton("Выход из игры");

        gameControlPanel.add(btnStartGame);
        gameControlPanel.add(btnExitGame);
    }

    // 2. Создаём блок информации об игре:
    //      - имя игрока;
    //      - размер карты;
    //      - количество врагов.
    private void setupGameInfo() {
        gameInfoPanel = new JPanel();
        gameInfoPanel.setLayout(new GridLayout(4, 1));

        playerName = new JLabel("Игрок: ");
        mapSize = new JLabel("Создана карта размером: ");
        countMonster = new JLabel("Создано врагов: ");

        gameInfoPanel.add(new JLabel("=== Информация ==="));
        gameInfoPanel.add(playerName);
        gameInfoPanel.add(mapSize);
        gameInfoPanel.add(countMonster);
    }

    // 3. Создаём блок информации об игроке:
    //      - уровень здоровья;
    //      - сила;
    private void setupPlayerInfo() {
        gamePlayerPanel = new JPanel();
        gamePlayerPanel.setLayout(new GridLayout(3, 1));

        playerAttackPoint = new JLabel("Сила игрока: ");
        playerHealthPoint = new JLabel("Очки здоровья игрока: ");

        gamePlayerPanel.add(new JLabel("=== Информация об игроке ==="));
        gamePlayerPanel.add(playerAttackPoint);
        gamePlayerPanel.add(playerHealthPoint);
    }

    // 4. Создаём блок информации о врагах:
    //      - уровень здоровья;
    //      - сила;
    private void setupMonsterInfo() {
        gameMonsterPanel = new JPanel();
        gameMonsterPanel.setLayout(new GridLayout(3, 1));

        monsterAttackPoint = new JLabel("Сила врагов: ");
        monsterHealthPoint = new JLabel("Очки здоровья врагов: ");

        gameMonsterPanel.add(new JLabel("=== Информация о врагах ==="));
        gameMonsterPanel.add(monsterAttackPoint);
        gameMonsterPanel.add(monsterHealthPoint);
    }

    // 5. Создаём блок кнопок управления игроком
    private void setupPlayerController() {
        playerControllerPanel = new JPanel();
        playerCenterPanel = new JPanel();
        playerControllerPanel.setLayout(new GridLayout(1, 3));
        playerCenterPanel.setLayout(new GridLayout(2, 1));

        btnLeft = new JButton("\uD83E\uDC44");
        btnUp = new JButton("\uD83E\uDC45");
        btnDown = new JButton("\uD83E\uDC47");
        btnRight = new JButton("\uD83E\uDC46");

//        playerControllerPanel.add(new JLabel("=== Управление игроком ==="));
        playerControllerPanel.add(btnLeft);
        playerControllerPanel.add(playerCenterPanel);
        playerCenterPanel.add(btnUp, BorderLayout.NORTH);
        playerCenterPanel.add(btnDown, BorderLayout.SOUTH);
        playerControllerPanel.add(btnRight);
    }

    // 6. Создаём блок с информационными сообщениями
    private void setupGameLog() {
        gameLog = new JTextArea();
        gameLogScrollPanel = new JScrollPane(gameLog);

        gameLog.setEditable(false);
        gameLog.setLineWrap(true);
    }

    // Метод позволяющий отправлять в Лог записи
    void writeLogs(String msg) {
        gameLog.append(msg + "\n");
    }

    // Настройки окна
    private void setupWin() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(winPosX, winPosY);
        setSize(winWidth, winHeight);
        setTitle("Epic WAR");
        setResizable(false);
    }
}
