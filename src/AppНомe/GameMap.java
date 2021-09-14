package AppНомe;

import AppНомe.classes.Fighters;
import AppНомe.classes.Monster;
import AppНомe.classes.Player;

import javax.swing.*;
import java.awt.*;

/**
 * Класс карты
 * Ответственный за создание класса - А.А. Дюжаков
 * Дата создания: 03.09.2021
 */

public class GameMap extends JPanel {

    private WindowApp gameWindow; // Ссылка на окно, в котором происходит отрисовка окна с картой

    // Создаём приватные классы игрока и врагов
    private Player player;
    private Monster monster;

    // Переменные относящиеся к карте
    private int[][] map;
    private int mapWidth;
    private int mapHeight;
    private int mapValueMin = 3;
    private int mapValueMax = 6;

    private int cellWidth;
    private int cellHeight;

    private boolean isMapExist;
    private boolean isGameStart;

    // Финальные поля движения
    private final int DIRECTION_MOVE_UP = 8;
    private final int DIRECTION_MOVE_DOWN = 2;
    private final int DIRECTION_MOVE_LEFT = 4;
    private final int DIRECTION_MOVE_RIGHT = 6;

    // Финальные поля для определения, кто занимает ячейку карты
    private final int CELL_PLAYER = 1;
    private final int CELL_MONSTER = 11;
    private final int CELL_READY = 111;

    // Создаём конструктор для панели карты
    GameMap(WindowApp gameWindow) {
        this.gameWindow = gameWindow; // назначение переменной в данном приватном классе окна отрисовки с класса WindowApp
        this.isMapExist = false; // Пока уровень не запущен карты не существует
        setBackground(Color.black);
    }

    // Метод старта игры на карте по команде с кнопки "Старт"
    void startGame() {
        gameWindow.writeLogs("Start Game");
        player = new Player("Mario");
        createdMap();
        isMapExist = true; // Карта существует (см. строку 51)
        spawnPlayer();
        spawnMonster();
        gameWindow.refreshGameInfo();
    }

    // Создаём карту
    private void createdMap() {
        mapHeight = Tools.randomValue(mapValueMin, mapValueMax);
        mapWidth = Tools.randomValue(mapValueMin, mapValueMax);
        map = new int[mapHeight][mapWidth];
//        gameWindow.writeLogs("Создана карта размером: " + mapWidth + " х " + mapHeight);
        repaint();
    }

    // Метод отрисовки карты
    private void render(Graphics g) {
        if (!isMapExist) {
            return;
        }

        paintMap(g);
        paintFighters(g);
    }

    // Метод рисующий границы ячеек карты
    private void paintMap(Graphics g) {
        int widthMe = getWidth();
        int heightMe = getHeight();

        cellWidth = widthMe / mapWidth;
        cellHeight = heightMe / mapHeight;

        g.setColor(Color.lightGray);

        for (int i = 0; i < mapHeight; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, widthMe, y);
        }

        for (int i = 0; i < mapWidth; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, heightMe);
        }
    }

    // Метод рисующий игрока, врагов и пройденные ячейки
    private void paintFighters(Graphics g) {
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {

                if (map[y][x] != CELL_PLAYER && map[y][x] != CELL_MONSTER) {
                    continue;
                }

                if (map[y][x] == CELL_PLAYER) {
                    g.setColor(Color.GREEN);
                    g.fillRect(x * cellWidth, y * cellHeight, cellWidth, cellHeight);
                }

                if (map[y][x] == CELL_MONSTER) {
                    g.setColor(Color.ORANGE);
                    g.fillRect(x * cellWidth, y * cellHeight, cellWidth, cellHeight);
                }

                if (map[y][x] == CELL_READY) {
                    g.setColor(Color.GRAY);
                    g.fillRect(x * cellWidth, y * cellHeight, cellWidth, cellHeight);
                }
            }
        }
    }

    // Размещаем игрока на карте
    private void spawnPlayer() {
        player.setCoordinates(0, 0);
        map[player.getPositionY()][player.getPositionX()] = CELL_PLAYER;
        gameWindow.writeLogs("Координаты игрока: " + player.getPositionX() + ":" + player.getPositionY());
//        gameWindow.writeLogs("Создан игрок с именем: " + player.getPlayerName());
//        gameWindow.writeLogs("Очки здоровья: " + player.getHealthPoint());
//        gameWindow.writeLogs("Очки атаки: " + player.getAttackPoint());
    }

    // Размещаем врагов на карте
    private void spawnMonster() {

//        Monster.number = (mapWidth + mapHeight) / 4; // Произвольная логика количества врагов
        int countMonster = (mapWidth + mapHeight) / 4; // Произвольная логика количества врагов
        int monsterPositionX;
        int monsterPositionY;

        for (int i = 0; i < countMonster; i++) {
            do {
//                monsterPositionX = Tools.randomValue(0, mapWidth);
//                monsterPositionY = Tools.randomValue(0, mapHeight);
                monsterPositionX = Tools.random.nextInt(mapWidth);
                monsterPositionY = Tools.random.nextInt(mapHeight);
            } while (!isMapEmpty(monsterPositionX, monsterPositionY));
            map[monsterPositionY][monsterPositionX] = CELL_MONSTER;
            monster = new Monster();
        }
        gameWindow.writeLogs("Координаты врага: " + monster.getPositionX() + ":" + monster.getPositionY());
        gameWindow.writeLogs("Создано врагов: " + countMonster);
        gameWindow.writeLogs("Количество врагов: " + Monster.number);
    }

    // Метод перемещения игрока по карте
    private void goPlayer(int currentY, int currentX, int nextY, int nextX) {

        if (map[nextY][nextX] == '#') {
            warPlayer();
        }
        map[currentY][currentX] = CELL_READY;
        map[nextY][nextX] = CELL_PLAYER;
    }

    // Метод проверяющий валидность хода игрока в пределах карты
    private boolean goPlayerIsGood(int currentY, int currentX, int nextY, int nextX) {
        if (nextY >= 0 && nextY < mapHeight && nextX >= 0 && nextX < mapWidth) {
            return true;
        } else {
            player.setCoordinates(currentX, currentY);
            gameWindow.writeLogs("Неверный ход, вы пытаетесь выйти за границу карты");
            return false;
        }
    }

    // Метод взаимодействия между игроком и врагами
    private void warPlayer() {
        int warRound = 1;
        int currentMonsterAttackPoint;

        gameWindow.writeLogs("===== WAR =====");

        while (player.isAlive() && monster.isAlive()) {
            gameWindow.writeLogs("Сражение №: " + warRound);
            monster.decreaseHealth(player.getAttackPoint());
            gameWindow.writeLogs("Врагу нанесён урон: " + player.getAttackPoint());
            if (monster.isAlive()) {
                currentMonsterAttackPoint = (monster.getMaxAttackPoint() * monster.getHealthPoint() / monster.getMaxHealthPoint()); // Уменьшение сил врага в зависимости от % очков здоровья
            } else currentMonsterAttackPoint = (monster.getMaxAttackPoint() / Tools.randomValue(10, monster.getMaxAttackPoint())); // Рандомная сила врага (от 10% до 1 очка) для возможного последнего удара
            if (monster.isAlive()) {
                player.decreaseHealth(currentMonsterAttackPoint);
                gameWindow.writeLogs("Враг нанёс урон игроку: " + currentMonsterAttackPoint);
            } else {
                gameWindow.writeLogs("Враг повержен");
                if (Tools.randomValue(0, 1) == 1) {
                    gameWindow.writeLogs(", однако он успел нанести коварный удар в спину");
                    gameWindow.writeLogs("\nИз последних сил враг нанёс урон игроку: " + currentMonsterAttackPoint);
                    player.decreaseHealth(currentMonsterAttackPoint);
                }
                --Monster.number; // Уменьшение количества врагов
            }
            warRound++;
        }
        player.increaseHealth(player.getHealthPoint() + Tools.randomValue(0, monster.getMaxHealthPoint())); // Пополнение здоровья игрока
        if (player.getHealthPoint() > 100) {
            player.increaseHealth(100);
        }
        player.decreaseAttack(player.getAttackPoint() * player.getHealthPoint() / 100); // Изменение силы атаки игрока в зависимости от % здоровья
        gameWindow.writeLogs("===== END WAR =====");
    }

    // Метод реализующий шаги игры
//    public void stepByStep() {
//        while (true) {
//            controlPlayer();
//            showMap();
//
//            if (!player.isAlive()) { //Окончание игры, если игрок мёртв
//                gameWindow.writeLogs("===== GAME OVER! =====");
//                break;
//            }
//
//            if (endGame(playerPositionY, playerPositionX)) { //Окончание игры, если все враги мертвы
//                gameWindow.writeLogs("===== GAME WIN! =====");
//                break;
//            }
//
//        }
//    }

    // Метод проверяющий ячейку карты на пустое значение
    private boolean isMapEmpty(int x, int y) {
        return (map[y][x] != CELL_PLAYER && map[y][x] != CELL_MONSTER && map[y][x] != CELL_READY);
    }

    // Метод проверки завершения игры
    private boolean endGame(int currentY, int currentX) {
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                if (map[y][x] != CELL_READY && map[y][x] != CELL_PLAYER) return false;
            }
        }
        return true;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    // Создаём геттер на игрока
    public Player getPlayer() {
        return player;
    }

    // Создаём геттер на врагов
    public Monster getMonster() {
        return monster;
    }

    // Создаём геттер на размеры карты
    public String getMapSize() {
        return (mapWidth + ":" + mapHeight);
    }
}
