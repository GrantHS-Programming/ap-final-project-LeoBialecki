package com.journaldev.files;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;


public class APFinalProject {

    static JFrame board = new JFrame("Pong");

    public static void main(String[] args) {
        board.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        board.setSize(650,495);
        Pong game = new Pong();
        board.add(game);
        board.setVisible(true);

    }

    Timer timer = new Timer(33, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            game.repaint();
        }
    });

    timer.start();

    public APFinalProject() {

    }


}
