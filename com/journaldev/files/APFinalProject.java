package com.journaldev.files;
import javax.swing.*;
import java.awt.*;


public class APFinalProject {

    static JFrame board = new JFrame("Pong");

    public static void main(String[] args) {
        board.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        board.setSize(650,495);
        Pong pongGame = new Pong();
        board.add(pongGame);
        board.setVisible(true);

    }

    public APFinalProject() {

    }

    public class Ball {
        private int x, y, cx, cy, speed, size;
        private Color color;

        public Ball(int x,int y,int cx,int cy,int speed, Color color,int size){
            this.x = x;
            this.y = y;
            this.cx = cx;
            this.speed = speed;
            this.color = color;
            this.size = size;
        }

        public void paint(Graphics g){
            g.setColor(color);
            g.fillOval(x,y,size,size);
        }


    }
}
