package main;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) throws Exception {
        // sets up the game window
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("Game");

        // Add the game panel settings/prefrinces to the window
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
