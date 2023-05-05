import java.util.*;

//*CallingMethodsInSameClass.java
//illustrates how to call static method a classn from a method in the same class

 public class CallingMethodsInSameClass{

    public static void main (String[] args) {
        printOne();
        printOne();
        printTwo();
    }

    public static void printOne() {
        System.out.println("HELLO MAN STYLO !!!!");
    }

    public static void printTwo() {
        printOne();
        printOne();
    }
}

    