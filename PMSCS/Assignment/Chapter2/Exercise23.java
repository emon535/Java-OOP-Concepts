import java.util.*;
import javax.swing.*;
import java.text.*;

public class Exercise23 {
    public static void main(String[] args) {
        Date presentTime = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss a");
        JFrame presentTimeWindow = new JFrame();
        presentTimeWindow.setSize(600, 200);
        presentTimeWindow.setTitle(simpleDateFormat.format(presentTime));
        presentTimeWindow.setVisible(true);
    }
}