package NubersDevidedBy7;
import java.util.*;

public class DividedBy7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many number? ");
        int a = sc.nextInt();
        sc.close();
        System.out.println("Numbers divided by 7:");
        for(int i=1; i<=a ; i++ ){
            int b = i*7;
            System.out.println(b);
        }
    }
}
