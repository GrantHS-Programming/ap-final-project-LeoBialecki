import javax.swing.*;
import java.awt.*;

public class Pong extends JPanel {

    JPanel pongGame = new JPanel();
    static final int WINDOW_WIDTH = 650, WINDOW_HEIGHT = 480;
    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0, WINDOW_WIDTH, WINDOW_HEIGHT);
    }

}
