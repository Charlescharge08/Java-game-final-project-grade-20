package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
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

    // FPS settings
    int FPS = 60;

    keyHandler keyH = new keyHandler();
    Thread gameThread;

    // sets player position

    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 2;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

        double drawInterval = 1000000000 / FPS;
        double nextDrawTime = System.nanoTime() + drawInterval;

        while (gameThread != null) {

            // 1 Update: update information such as player position, enemy position, etc.
            update();
            // 2 Draw: draw the screen with the updated information.
            repaint();

            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime / 1000000; // convert to milliseconds for the sleep method

                if (remainingTime < 0) {
                    remainingTime = 0;
                }

                Thread.sleep((long) remainingTime);
                nextDrawTime += drawInterval;

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }

    public void update() {

        if (keyH.upPressed) {
            playerY -= playerSpeed;
        } else if (keyH.downPressed) {
            playerY += playerSpeed;
        } else if (keyH.leftPressed) {
            playerX -= playerSpeed;
        } else if (keyH.rightPressed) {
            playerX += playerSpeed;
        }

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.WHITE);
        g2.fillRect(playerX, playerY, tileSize, tileSize);

        g2.dispose();

    }
}
