import java.awt.*;
public class Paddle {

    private int height, x, y, speed;
    private Color color;

    static final int PADDLE_WIDTH = 15;

    public Paddle(int x, int y, int height, int speed, Color color){
        this.x = x;
        this.y = y;
        this.height = height;
        this.speed = speed;
        this.color = color;
    }

    g.fillRect(x, y, width, height);

    public void moveTowards(int moveToY) {
        int centerY = y + height / 2;

        if (Math.abs(centerY - moveToY) > speed){
            if (centerY > moveToY) {
                y -= speed;
            }
            if (centerY < moveToY) {
                y += speed;
            }
        }
    }
}
