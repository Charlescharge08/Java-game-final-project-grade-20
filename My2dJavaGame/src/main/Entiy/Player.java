package Entiy;

import main.GamePanel;
import main.keyHandler;

public class Player extends entiy{
    GamePanel gp;
    keyHandler keyH;

    public Player(GamePanel gp, keyHandler keyH){
        this.gp = gp;
        this.keyH = keyH;
    }
}
