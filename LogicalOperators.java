import java.util.*;

public class LogicalOperators {
    public static void main (String [] args) {

        Scanner tempreature = new Scanner(System.in);
        System.out.println(" What's the tempreature outside in celcius?");
        int temp = tempreature.nextInt();

        if (temp >= 33) {
            System.out.println ("It's fucking HOT outside !!");
        }

        else if (temp >= 18 && temp <= 33) {
            System.out.println ("Its WARM outside");
        }

        else {
            System.out.println ("It's god dammit COLD outside !!!");
        }
    }
}
