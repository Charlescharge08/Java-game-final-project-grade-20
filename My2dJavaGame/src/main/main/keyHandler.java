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

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_W) {
            upPressed = false;
            //System.out.println("upPressed");
        }
        if (code == KeyEvent.VK_S) {
            downPressed = false;
            //System.out.println("downPressed");
        }
        if (code == KeyEvent.VK_A) {
            leftPressed = false;
            //System.out.println("leftPressed");
        }

        if (code == KeyEvent.VK_D) {
            rightPressed = false;
            //System.out.println("rightPressed");
        }
    }

}
