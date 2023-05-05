import java.util.*;

public class IfStatement {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("What is your age??");
        int age = sc.nextInt();
        //sc.nextLine();
        //int age = 56;

        if (age >= 55) {
            System.out.println("You are a BOOMERS !!");
        }

        else if (age >= 25) {
            System.out.println("You are an ADULTS !!");
        }

        else {
            System.out.println("You are a KIDS !!");
        }
    }
}
