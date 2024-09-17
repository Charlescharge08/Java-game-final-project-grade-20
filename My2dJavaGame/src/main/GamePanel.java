package main;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
    // screen settings
    final int originalTileSize = 16; // 16x16 pixels
    final int scale = 3; // scale factor or it will be too small

    final int tileSize = originalTileSize * scale; // 48x48 pixels

    final int maxScreenCol = 16; // 16 tiles tall
    final int maxScreenRow = 12; // 12 tiles wide
    final int screenWidth = tileSize * maxScreenCol; // 768 pixels
    final int screenHeight = tileSize * maxScreenRow; // 576 pixels

    Thread gameThread;

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight)); 
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(gameThread != null){

            System.out.println("Game running");

            // 1 Update: update information such as player position, enemy position, etc.

            // 2 Draw: draw the screen with the updated information.
        }
    }

    public void update(){

    }
    public void paintComponent(){

    }
}
