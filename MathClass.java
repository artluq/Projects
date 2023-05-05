
//Luqman Razak
//Math Class

import java.util.*;

public class MathClass {
    public static void main (String [] args){
        double a = 3.14;
        double b = -10;
        double c = Math.max(a, b);
        double d = Math.min(a, b);

        double x;
        double y;
        double z;

        Scanner AngleInput = new Scanner (System.in);

        System.out.println("\nMax value between "+a+" and "+b+" is :\n" + c);
        System.out.println("\nMin value between "+a+" and "+b+" is :\n" + d);

        System.out.println("\nEnter side x: ");
        x = AngleInput.nextDouble();
        System.out.println("Enter side y: ");
        y = AngleInput.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("\nThe hypotenuse for x and y are: " +z);

        AngleInput.close();
    }

}

/***
 * The given code is a Java program that uses the Math class in Java to perform mathematical operations. 
 * The code performs the following tasks:

 * 1. Initializes two variables a and b with the values 3.14 and -10 respectively.

 * 2. Calculates the maximum value between a and b using the Math.max method and stores the result in c. 
       It also calculates the minimum value between a and b using the Math.min method and stores the result in d.

 * 3. Reads two values from the user using a Scanner object AngleInput and stores them in the variables x and y.

 * 4. Calculates the length of the hypotenuse for a right triangle with sides x and y using the Pythagorean theorem, 
       which is represented as z = Math.sqrt((x*x)+(y*y)).

 * 5. Prints the results of the c, d, and z variables.

    Finally, the Scanner object is closed using the AngleInput.close() method.
 */