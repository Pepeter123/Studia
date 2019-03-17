package BMIpointer;

import java.util.Scanner;
public class BMi {
    public static void main(String[] args){
        System.out.print("Write your weight [kg]: ");
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        System.out.print("Write your height [cm]: ");
        double h = sc.nextDouble();
        sc.close();
        double b = w/(h*h*0.0001);
        System.out.println("Your BMI = " + b);


    }
}
