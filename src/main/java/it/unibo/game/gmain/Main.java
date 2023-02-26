package it.unibo.game.gmain;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Arkanoid");

        GamePanel gp = new GamePanel();
        window.add(gp);

        window.setVisible(true);

        gp.setupGame();
        gp.startGameThread();
    }
}