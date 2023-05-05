import java.util.*;

public class Methods1 {
    public static void main (String [] args){
        String name = "LUQY";
        int age = 29;
        double height = 174;
        double weight = 70.6;
        hello(name, age, height, weight);
        
    }

    static void hello(String name, int age, double height, double weight ){
        System.out.println("Hello " +name);
        System.out.println("Your age is "+age);
        System.out.println("Your height is " + height);
        System.out.println("Your weight is " + weight);
    }
}
