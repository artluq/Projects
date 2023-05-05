import java.util.*;

public class NestedLoop {
    public static void main (String [] args){

        Scanner nestedLoop = new Scanner (System.in);
        int rows;
        int colums;
        String symbol = "" ;

        System.out.println("Enter # of rows: ");
        rows = nestedLoop.nextInt();
        System.out.println("Enter # of colums: ");
        colums = nestedLoop.nextInt();
        System.out.println("Enter your SYMBOL: ");
        symbol = nestedLoop.next();

        for (int i=1; i<=rows; i++){
            System.out.println();
            for (int j=1; j<=colums; j++){
                System.out.println(symbol);
            }
        }

    }
    
}
