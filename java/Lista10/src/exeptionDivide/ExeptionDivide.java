package exeptionDivide;

import java.util.Scanner;

public class ExeptionDivide {
    public static void main(String[] args) {
        System.out.println("Podaj licznik: ");
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        System.out.println("Podaj mianownik: ");
        int m = in.nextInt();
        try {
            int w = l / m;
            System.out.println(w);
        } catch (ArithmeticException e) {
            System.out.println("You cnt divide by 0");
            e.printStackTrace();
        }
    }
}