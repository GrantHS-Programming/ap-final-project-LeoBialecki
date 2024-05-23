package com.journaldev.files;
import javax.swing.*;
import java.awt.*;


public class APFinalProject {

    static JFrame board = new JFrame("Pong");

    public static void main(String[] args) {
        board.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        board.setSize(650,495);
        Pong game = new Pong();
        board.add(game);
        board.setVisible(true);

    }

    public APFinalProject() {

    }


}
