//package Test;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Polipoli obj = new Polipoli();
        obj.disp();
        Polipoli obj2 = new Demo();
        obj2.disp();

    }
}

class Polipoli {
    public void disp() {
        System.out.println("disp() method of Parent Class");
    }
}

class Demo extends Polipoli {
    public void disp(){
        System.out.println("disp() method of Child Class");
    }
}
