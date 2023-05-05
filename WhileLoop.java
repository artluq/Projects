import java.util.*;

public class WhileLoop {
    public static void main (String [] args) {

        Scanner user = new Scanner (System.in);
        String x = " ";
        //Scanner id = new Scanner (System.in);
        String y = " ";

        do {
            System.out.println ("Enter your name");
            x = user.nextLine();
            System.out.println("Enter your username");
            y = user.nextLine();
        }
        while (x.isBlank() || y.isBlank());

        System.out.println("Hello " + x + ", your username are " + y );
    }
}
