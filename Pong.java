import javax.swing.*;
import java.awt.*;

public class Pong extends JPanel {

    static final int WINDOW_WIDTH = 640, WINDOW_HEIGHT = 480;




    private Ball gameBall;

    public Pong(){
        gameBall = new Ball(300, 200,3,3,3, Color.YELLOW, 10);
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0, WINDOW_WIDTH, WINDOW_HEIGHT);

        gameBall.paint(g);


    }



}
