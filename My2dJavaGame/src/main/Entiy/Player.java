package Entiy;

import java.awt.Color;
import java.awt.Graphics2D;
import main.GamePanel;
import main.keyHandler;

public class Player extends entiy{
    GamePanel gp;
    keyHandler keyH;

    public Player(GamePanel gp, keyHandler keyH){
        this.gp = gp;
        this.keyH = keyH;
        setDefaultValues();
    }
    public void setDefaultValues(){
        x = 100;
        y = 100;
        speed = 2;
    } 
    public void update(){
        if(keyH.upPressed){
            y -= speed;
        }
        if(keyH.downPressed){
            y += speed;
        }
        if(keyH.leftPressed){
            x -= speed;
        }
        if(keyH.rightPressed){
            x += speed;
        }
    }
    public void draw(Graphics2D g2){
        g2.setColor(Color.WHITE);
        g2.fillRect(x, y, gp.tileSize, gp.tileSize);
    }
}
