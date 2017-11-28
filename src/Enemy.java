import java.awt.*;
import java.util.Random;

public class Enemy extends GameObject {
    
    public Enemy(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;
    }
    
    private Handler handler;
    Random r = new Random();
    int choose = 0;
    int hp = 100;
    
    public void tick() {
        x += velX;
        y += velY;
        
        choose = r.nextInt(10);
        
        if(choose == 0) {
            velX = (r.nextInt(4 - -4 + -4));
            velY = (r.nextInt(4 - -4 + -4));
        }
    }
    
    public void render(Graphics g) {
        g.setColor(Color.yellow);
        g.fillRect(x,y,32,32);
        
    }
    
    public Rectangle getBounds() {
        return new Rectangle(x,y,32,32);
    }
}
