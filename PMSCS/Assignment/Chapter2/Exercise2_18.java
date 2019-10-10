import javax.swing.*;

class Exercise2_18 extends JFrame {
    // JFrame helloWindow = new JFrame();
    JTextField nameField = new JTextField(30);
    JLabel nameLabel = new JLabel();

    public NameWindow()
    {
        setSize(800, 600);
        setTitle("Welcome to java");

        // helloWindow.add(nameField);
        // helloWindow.add(nameLabel);
        setVisible(true);
    }

    }

    public static void main(String[] args) {
        NameWindow nameWindow = new NameWindow();
        System.out.println("I m happy with the first code run!");

    }
