import java.util.Calendar;

public class Exercise20 {

   public static void main(String[] args) {
      Calendar c = Calendar.getInstance();
      System.out.println("Formated Time :");
      System.out.format("%tB %te, %tY%n", c, c, c);
   }
}