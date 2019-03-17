package Calculator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Write 2 numbers:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Choose operation 1-4: \n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division ");
        int number = sc.nextInt();
        switch (number) {
            case 1: {
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            }
            case 2: {
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            }
            case 3: {
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            }
            case 4: {
                if (b==0) System.out.println("You cant divide by 0.");
                else System.out.println(a + " / " + b + " = " + (a / b));
                break;
            }
            default: {
                System.out.println("You didnt write nubmer betweet 1 and 4");
                break;
            }

        }
    }
}
