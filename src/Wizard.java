import java.awt.*;

public class Wizard extends GameObject {
    
    public Wizard(int x, int y, ID id) {
        super(x, y, id);
    }
    
    public void tick() {
        x += velX;
        y += velY;
    }
    
    public void render(Graphics g) {
    
    }
    
    public Rectangle getBounds() {
        return null;
    }
}
