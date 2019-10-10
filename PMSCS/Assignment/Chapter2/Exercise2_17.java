// Problem Statement 17:  Write a program that displays a frame window 800 pixels wide and 600 pixels high. Set the title of the frame to Welcome to Java.

import javax.swing.JFrame;

// Exercise no: Chapter2_17

public class Exercise2_17 {
    public static void main(String[] args) {

        JFrame helloWindow = new JFrame();
        helloWindow.setSize(800, 600);
        helloWindow.setTitle("Welcome to java");
        helloWindow.setVisible(true);

        // System.out.println("I m happy with the first code run!");

    }
}
