package Lesson04.home;

import java.util.Random;
import java.util.Scanner;

/**
 * Ответственный за создание класса - А.А. Дюжаков
 * Дата создания: 25.08.2021
 */

public class HomeWorkApp04 {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    // Объявляем необходимые переменные

    // Переменные относящиеся к игроку
    public static char playerPoint = '@';
    public static String playerName;
    public static int playerHealthPoint = 100;
    public static int playerAttackPoint;
    public static int playerPositionX;
    public static int playerPositionY;
    public static final int PLAYER_MOVE_UP = 8;
    public static final int PLAYER_MOVE_DOWN = 2;
    public static final int PLAYER_MOVE_LEFT = 4;
    public static final int PLAYER_MOVE_RIGHT = 6;
    public static int playerValueMin = 20;
    public static int playerValueMax = 30;

    // Переменные относящиеся к врагам
    public static char monsterPoint = '#';
    public static int monsterHealthPoint;
    public static int monsterAttackPoint;
    public static int monsterValueMin = 20;
    public static int monsterValueMax = 30;

    // Переменные относящиеся к карте
    public static char[][] map;
    public static int mapWidth;
    public static int mapHeight;
    public static int mapValueMin = 3;
    public static int mapValueMax = 6;
    public static char mapEmpty = '_';
    public static char mapReady = '*';

    public static void main(String[] args) {
        createdMap();
        spawnPlayer();
        spawnMonster();
        System.out.println("===== Create MAP =====");
        showMap();
        System.out.println("===== Map Size " + mapHeight + "x" + mapWidth + " =====");

    }

    // Создаём карту
    public static void createdMap() {
        mapHeight = randomValue(mapValueMin, mapValueMax);
        mapWidth = randomValue(mapValueMin, mapValueMax);
        map = new char[mapHeight][mapWidth];

        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                map[y][x] = mapEmpty;
            }
        }
    }

    // Отрисовываем карту
    public static void showMap() {
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
    }

    // Размещаем игрока на карте
    public static void spawnPlayer() {
        System.out.print("Введите имя игрока: ");
        playerName = scanner.next();
        playerPositionX = 0;
        playerPositionY = 0;
        map[playerPositionY][playerPositionX] = playerPoint;
        playerAttackPoint = randomValue(playerValueMin, playerValueMax);
        System.out.println("Игрок: " + playerName);
        System.out.println("Очки здоровья игрока: " + playerHealthPoint);
        System.out.println("Очки урона игрока: " + playerAttackPoint);
    }

    // Размещаем врагов на карте
    public static void spawnMonster() {
        monsterAttackPoint = randomValue(monsterValueMin, monsterValueMax);
        monsterHealthPoint = randomValue(monsterValueMin, monsterValueMax);

        int countMonster = (mapWidth + mapHeight) / 4; // Произвольная логика количества врагов

        int monsterPositionX;
        int monsterPositionY;

        for (int i = 0; i < countMonster; i++) {
            do {
                monsterPositionX = random.nextInt(mapWidth);
                monsterPositionY = random.nextInt(mapHeight);
            } while (monsterPositionX == playerPositionX & monsterPositionY == playerPositionY);
            map[monsterPositionY][monsterPositionX] = monsterPoint;
        }
        System.out.println("Создано врагов: " + countMonster);
        System.out.println("Очки здоровья врага: " + monsterHealthPoint);
        System.out.println("Очки урона врага: " + monsterAttackPoint);
    }

    // Метод возвращающий любое целое число
    public static int randomValue(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }
}
