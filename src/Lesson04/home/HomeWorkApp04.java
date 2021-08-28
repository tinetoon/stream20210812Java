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
    public static int monsterValueMin = 50;
    public static int monsterValueMax = 80;

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
        stepByStep();

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
            } while (map[monsterPositionY][monsterPositionX] == '@' | map[monsterPositionY][monsterPositionX] == '#');
            map[monsterPositionY][monsterPositionX] = monsterPoint;
        }
        System.out.println("Создано врагов: " + countMonster);
        System.out.println("Очки здоровья врага: " + monsterHealthPoint);
        System.out.println("Очки урона врага: " + monsterAttackPoint);
    }

    // Метод для управления игроком
    public static void controlPlayer() {
        int currentX = playerPositionX;
        int currentY = playerPositionY;

        do {
            System.out.print("Для перемещения введите цифру (вправо, нажмите " + PLAYER_MOVE_RIGHT
                                + ", влево - " + PLAYER_MOVE_LEFT
                                + ", вниз - " + PLAYER_MOVE_DOWN
                                + ", вверх - " + PLAYER_MOVE_UP + "): ");
            int playerMove = scanner.nextInt();
            switch (playerMove) {
                case PLAYER_MOVE_RIGHT:
                    playerPositionX +=1;
                    break;
                case PLAYER_MOVE_LEFT:
                    playerPositionX -= 1;
                    break;
                case PLAYER_MOVE_DOWN:
                    playerPositionY += 1;
                    break;
                case PLAYER_MOVE_UP:
                    playerPositionY -=1;
                    break;
            }
        } while (goPlayerIsGood(currentY, currentX, playerPositionY, playerPositionX) == false);

        goPlayer(currentY, currentX, playerPositionY, playerPositionX);
    }

    // Метод проверяющий валидность хода игрока в пределах карты
    public static boolean goPlayerIsGood(int currentY, int currentX, int nextY, int nextX) {
        if (nextY >= 0 && nextY < mapHeight && nextX >= 0 && nextX < mapWidth) {
            return true;
        } else {
            playerPositionY = currentY;
            playerPositionX = currentX;
            System.out.println("Неверный ход, вы пытаетесь выйти за границу карты");
            return false;
        }
    }

    // Проверка жизни игрока
    public static boolean isPlayerAlive() {
        return playerHealthPoint > 0;
    }

    // Метод перемещения игрока по карте
    public static void goPlayer(int currentY, int currentX, int nextY, int nextX) {

        if (map[nextY][nextX] == '#') {
            warPlayer();
        }
        map[currentY][currentX] = mapReady;
        map[nextY][nextX] = playerPoint;
    }

    // Метод взаимодействия между игроком и врагами
    public static void warPlayer() {
        int warRound = 1;
        int currentMonsterHealth = monsterHealthPoint;
        int currentMonsterAttackPoint = monsterHealthPoint;

        System.out.println("===== WAR =====");

        while (playerHealthPoint > 0 && currentMonsterHealth > 0) {
            System.out.println("Сражение №: " + warRound);
            currentMonsterHealth -= playerAttackPoint;
            currentMonsterAttackPoint = currentMonsterAttackPoint * currentMonsterHealth / monsterHealthPoint; // Уменьшение сил врага в зависимости от % очков здоровья
            if (currentMonsterHealth > 0) {
                System.out.println("Врагу нанесён урон, уровень здоровья врага: " + currentMonsterHealth);
                playerHealthPoint -= currentMonsterAttackPoint;
                System.out.println("Враг нанёс урон игроку: " + currentMonsterAttackPoint);
            } else {
                System.out.print("Враг повержен");
                if (randomValue(0, 1) == 1) {
                    System.out.println(", однако он успел нанести коварный удар в спину");
                    System.out.println("\nИз последних сил враг нанёс урон игроку: " + currentMonsterAttackPoint);
                    playerHealthPoint -= currentMonsterAttackPoint;
                }
            }
            warRound++;
        }
        playerHealthPoint += randomValue(0, monsterHealthPoint); // Пополнение здоровья игрока
        if (playerHealthPoint > 100) {
            playerHealthPoint = 100;
        }
        playerAttackPoint = playerAttackPoint * playerHealthPoint / 100; // Изменение силы атаки игрока в зависимости от % здоровья
        System.out.println("\nУровень здоровья игрока " + playerName + " : " + playerHealthPoint);
        System.out.println("Очки здоровья игрока: " + playerHealthPoint);
        System.out.println("===== END WAR =====");
    }

    // Метод реализующий шаги игры
    public static void stepByStep() {
        while (true) {
            controlPlayer();
            showMap();

            if (!isPlayerAlive()) { //Окончание игры, если игрок мёртв
                break;
            }

            if (endGame(playerPositionY, playerPositionX)) { //Окончание игры, если все враги мертвы
                System.out.println("===== GAME WIN! =====");
                break;
            }

        }
    }

    // Метод проверки завершения игры
    public static boolean endGame(int currentY, int currentX) {
        map[currentY][currentX] = '*';
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                if (map[y][x] != '*') return false;
            }
        }
        map[currentY][currentX] = '@';
        return true;
    }

    // Метод возвращающий любое целое число
    public static int randomValue(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }
}
