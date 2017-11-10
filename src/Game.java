import java.awt.*;

public class Game extends Canvas implements Runnable {
    
    private static final long serialVersionUID = 123L;
    
    public Game() {
        new Window(1000,563,"Wizard Game",this);
    }
    
    public void run(){
    
    }
    
    
    public static void main(String[] Args) {
    
        new Game();
    
    }//end of main
    

}//end of Game class
