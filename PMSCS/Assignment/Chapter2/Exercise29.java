
// At the McGraw-Hill book website, you will find a Java package called
// galapagos. The galapagos package includes a Turtle class that is modeled
// after Seymour Papert’s logo. This Turtle has a pen, and when you move the
// Turtle, its pen will trace the movement. So by moving a Turtle object, you
// can draw many different kinds of geometric shapes. For example, this
// program commands a Turtle to draw a square:

import java.awt.*;
import galapagos.*;

public class Exercise29 {
    public static void main(String[] arg) {
        Turtle turtle = new Turtle();
        int arm = 120;
        turtle.penColor(Color.red);
        turtle.hide();
        turtle.jumpTo(-arm / 2, 0);
        turtle.speed(1000);
        for (int i = 0; i < 2; i++) {
            turtle.move(arm);
            turtle.turn(120);
        }
        turtle.move(arm);
    }
}
