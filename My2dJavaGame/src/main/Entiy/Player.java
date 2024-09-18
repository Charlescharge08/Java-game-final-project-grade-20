package Entiy;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import main.GamePanel;
import main.keyHandler;

public class Player extends entiy{
    GamePanel gp;
    keyHandler keyH;

    public Player(GamePanel gp, keyHandler keyH){
        this.gp = gp;
        this.keyH = keyH;
        setDefaultValues();
        getPlayerImage();
    }

    public void getPlayerImage(){
        try {
            
            up1 = ImageIO.read(getClass().getResourceAsStream("/player/boy_up_1.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("/player/boy_up_2.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("/player/boy_down_1.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("/player/boy_down_2.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/player/boy_left_1.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("/player/boy_left_2.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/player/boy_right_1.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/player/boy_right_2.png"));

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }


    public void setDefaultValues(){
        x = 100;
        y = 100;
        speed = 2;
        direction = "down";
    } 
    public void update(){
        if(keyH.upPressed){
            y -= speed;
            direction = "up";
        }
        if(keyH.downPressed){
            y += speed;
            direction = "down";
        }
        if(keyH.leftPressed){
            x -= speed;
            direction = "left";
        }
        if(keyH.rightPressed){
            x += speed;
            direction = "right";
        }
    }
    public void draw(Graphics2D g2){
//       g2.setColor(Color.WHITE);
//       g2.fillRect(x, y, gp.tileSize, gp.tileSize);

        BufferedImage image = null;
        switch (direction) {
            case "up":
                image = up1;
                break;
            case "down":
                image = down1;
                break;
            case "left":
                image = left1;
                break;
            case "right":
                image = right1;
                break;
        }
        
        g2.drawImage(image, x, y, gp.tileSize, gp.tileSize, null);
    
    }
}
