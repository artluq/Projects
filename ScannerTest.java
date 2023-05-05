
import java.util.*;

public class ScannerTest {

    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name =  ");
        String name = input.nextLine();

        System.out.println("How Old Are You = ");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("What is your favourite food = ");
        String favFood = input.nextLine();

        System.out.println("What is your height = ");
        double height = input.nextDouble();
        //input.nextDouble();
        System.out.println("What is your weight = ");
        double weight = input.nextDouble();
        input.nextLine();

        System.out.println("What is your blood type = ");
        String bloodType = input.nextLine();

        System.out.println("\n\n ******** Hello New AI ********");
        System.out.println(" Hyee " + name);
        System.out.println(" You are " + age + " years old");
        System.out.println(" Your favourit food is " + favFood);
        System.out.println(" Your height is " + height + " and your weight is " + weight);
        System.out.println(" Thus, your BMI is " + (weight/(height*height)));
        System.out.println(" You blood type are  " + bloodType );

    }
    
}