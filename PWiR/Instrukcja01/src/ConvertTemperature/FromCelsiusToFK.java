package ConvertTemperature;

import java.util.Scanner;

public class FromCelsiusToFK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Celsius degrees to convert: ");
        double c = sc.nextDouble();
        sc.close();
        double f = c * 1.8 + 32;
        double k = c + 273;
        System.out.println(c + " Celsius equal " + f +" Fahrenheit");
        System.out.println(c + " Celsius equal " + k + " Kelvin");

    }
}
