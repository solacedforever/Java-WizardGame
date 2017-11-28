import java.awt.*;

public class Enemy extends GameObject {
    
    public Enemy(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;
    }
    
    private Handler handler;
    
    public void tick() {
        x += velX;
        y += velY;
    }
    
    public void render(Graphics g) {
        g.setColor(Color.yellow);
        g.fillRect(x,y,32,32);
        
    }
    
    public Rectangle getBounds() {
        return new Rectangle(x,y,32,32);
    }
}
