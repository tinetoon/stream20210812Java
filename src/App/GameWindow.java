package App;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 01.09.2021
 */

public class GameWindow extends JFrame {

    private int winWidth = 1024;
    private int winHeight = 768;
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

    GameWindow() {
        setupWindow();

        map = new GameMap();

        setupGui();

        add(gui, BorderLayout.EAST);
        add(map);


        setVisible(true);
    }

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

    private void setupWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(winPosX, winPosY);
        setSize(winWidth, winHeight);
        setResizable(false);
        setTitle("This is GAME");
    }

}
