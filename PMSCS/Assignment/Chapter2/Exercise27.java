import java.util.Scanner;

public class Exercise27 {
    static Scanner myScanner= new Scanner(System.in);

    public static void main(String[] args) {
        String inputText;
        System.out.println("Please input the text:");
        inputText= myScanners.nextLine();

        int length;
        length = inputText.length();
        System.out.println(length);
        System.out.println(inputText.substring(0,1));
        System.out.println(inputText.substring(length-1,length));
    }
}