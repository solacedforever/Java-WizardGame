public class Camera {
    
    private float x,y;
    
    public Camera(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public void tick(GameObject object){
       
       // x = object.getX() + 1000/2; to have center camera
        
        x += ((object.getX() - x) - 1000/2) * 0.05f; //to follow player
        x += ((object.getX() - y) - 563/2) * 0.05f; //to follow player
        
    }
    
    public float getX() {
        return x;
    }
    
    public void setX(float x) {
        this.x = x;
    }
    
    public float getY() {
        return y;
    }
    
    public void setY(float y) {
        this.y = y;
    }
}
