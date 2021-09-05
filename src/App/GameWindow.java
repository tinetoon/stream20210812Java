package App;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 02.09.2021
 */

public class GameWindow extends JFrame {

    private int winWidth = 1024;
    private int winHeight = 768;
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

    GameWindow() {
        setupWindow();

        map = new GameMap();

        setupGui();

        add(gui, BorderLayout.EAST);
        add(map);


        setVisible(true);
    }

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


    private void setupWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(winPosX, winPosY);
        setSize(winWidth, winHeight);
        setTitle("This is my Game");
        setResizable(true);
    }

}
