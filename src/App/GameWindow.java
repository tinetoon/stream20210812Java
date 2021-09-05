package App;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
<<<<<<< HEAD
 * Date: 02.09.2021
=======
 * Date: 01.09.2021
>>>>>>> lesson07
 */

public class GameWindow extends JFrame {

    private int winWidth = 1024;
    private int winHeight = 768;
<<<<<<< HEAD
    private int winPosX = 300;
    private int winPosY = 100;

    private GameMap map;
    private JPanel gui;

    private JPanel gameControlDiv;
    private JButton btnStartGame;
    private JButton btnExitGame;

    private JPanel gameInfoDiv;

    private JPanel playerInfoDiv;

    private JPanel playerControllerDiv;

    private JPanel logDiv;
=======
    private int winPosX = 200;
    private int winPosY = 150;

    private JPanel gui;
    private GameMap map;

    private JPanel appControlsPanel;
    private JButton btnStartGame;
    private JButton btnExitGame;

    private JPanel gameInfoPanel;
    private JLabel currentLevel;
    private JLabel currentMapSize;
    private JLabel countEnemies;
>>>>>>> lesson07

    GameWindow() {
        setupWindow();

        map = new GameMap();

        setupGui();

        add(gui, BorderLayout.EAST);
        add(map);


        setVisible(true);
    }

<<<<<<< HEAD
    private void setupGui() {
        gui = new JPanel();
        gui.setLayout(new GridLayout(5, 1));

        setupGameControl();

        gui.add(gameControlDiv);

    }

    private void setupGameControl() {
        gameControlDiv = new JPanel();
        gameControlDiv.setLayout(new GridLayout(3,1));

        btnStartGame = new JButton("<html><s>Start Game</s></html>");
        btnExitGame = new JButton("<html><i>Exit Game</i></html>");

        gameControlDiv.add(new JLabel("== Game Menu =="));
        gameControlDiv.add(btnStartGame);
        gameControlDiv.add(btnExitGame);
    }

    private void setupGameInfo() {

    }

    private void setupPlayerInfo() {

    }

    private void setupPlayerController() {

    }

    private void setupLog() {

    }


=======
    private void setupGui() { // внутри панели GUI
        gui = new JPanel();
        gui.setLayout(new GridLayout(5,1));

        setupAppControls();
        setupGameInfo();

        gui.add(appControlsPanel);
        gui.add(gameInfoPanel);

    }

    private void setupAppControls() {
        appControlsPanel = new JPanel();
        appControlsPanel.setLayout(new GridLayout(3, 1));

        btnStartGame = new JButton("Start game");
        btnExitGame = new JButton("Exit game");

        appControlsPanel.add(new JLabel("=== Game menu ==="));
        appControlsPanel.add(btnStartGame);
        appControlsPanel.add(btnExitGame);
    }

    private void setupGameInfo() {
        gameInfoPanel = new JPanel();
        gameInfoPanel.setLayout(new GridLayout(4, 1));

        currentLevel = new JLabel("Current Level: - ");
        currentMapSize = new JLabel("Current map size: - ");
        countEnemies = new JLabel("Count Enemies: - ");

        gameInfoPanel.add(new JLabel("=== Game Info ==="));
        gameInfoPanel.add(currentLevel);
        gameInfoPanel.add(currentMapSize);
        gameInfoPanel.add(countEnemies);
    }

>>>>>>> lesson07
    private void setupWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(winPosX, winPosY);
        setSize(winWidth, winHeight);
<<<<<<< HEAD
        setTitle("This is my Game");
        setResizable(true);
=======
        setResizable(false);
        setTitle("This is GAME");
>>>>>>> lesson07
    }

}
