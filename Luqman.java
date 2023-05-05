import java.util.*;
public class Luqman {
    public static void main (String[] args){
        Scanner liverpool = new Scanner(System.in);

        System.out.println("What is your name = ");
        String name = liverpool.nextLine();

        System.out.println("What is your age = ");
        int age = liverpool.nextInt();
        liverpool.nextLine();

        System.out.println("What is your height in m = ");
        double height = liverpool.nextDouble();

        System.out.println("What is your weight in kg = ");
        double weight = liverpool.nextDouble();
        liverpool.nextLine();

        System.out.println("\n\n----- WELCOME NEW AI-----");
        System.out.println("HAI " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your height " + height + "m and your weight is " + weight + "kg");
        System.out.println("Thus, your BMI is " + (weight/(height*height)));

    }
}