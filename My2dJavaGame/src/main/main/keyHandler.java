package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyHandler implements KeyListener {

    public boolean upPressed, downPressed, leftPressed, rightPressed;

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        int code = e.getKeyCode();
        // W, A, S, D
        if (code == KeyEvent.VK_W) {
            upPressed = true;
        }
        if (code == KeyEvent.VK_S) {
            downPressed = true;
        }
        if (code == KeyEvent.VK_A) {
            leftPressed = true;
        }
        if (code == KeyEvent.VK_D) {
            rightPressed = true;
        }

        // Arrow keys
        if (code == KeyEvent.VK_UP) {
            upPressed = true;
        }
        if (code == KeyEvent.VK_DOWN) {
            downPressed = true;
        }
        if (code == KeyEvent.VK_LEFT) {
            leftPressed = true;
        }
        if (code == KeyEvent.VK_RIGHT) {
            rightPressed = true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        int code = e.getKeyCode();
        
        // W, A, S, D
        if (code == KeyEvent.VK_W) {
            upPressed = false;
            System.out.println("upPressed");
        }
        if (code == KeyEvent.VK_S) {
            downPressed = false;
            System.out.println("downPressed");
        }
        if (code == KeyEvent.VK_A) {
            leftPressed = false;
            System.out.println("leftPressed");
        }

        if (code == KeyEvent.VK_D) {
            rightPressed = false;
            System.out.println("rightPressed");
        }

        // Arrow keys
        if (code == KeyEvent.VK_UP) {
            upPressed = false;
            System.out.println("upPressed");
        }
        if (code == KeyEvent.VK_DOWN) {
            downPressed = false;
            System.out.println("downPressed");
        }
        if (code == KeyEvent.VK_LEFT) {
            leftPressed = false;
            System.out.println("leftPressed");
        }

        if (code == KeyEvent.VK_RIGHT) {
            rightPressed = false;
            System.out.println("rightPressed");
        }
    }

}
