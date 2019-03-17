package IsNumberPrime;

import java.util.Scanner;

public class PrimeNumbers {
        private static Scanner sc = new Scanner(System.in);
        private static String isPrimeNumber(int number)
        {
            if(number<2)
            {
                return "Number is not prime";
            }
            for(int i=2; i<=number/2; i++)
            {
                if(number%i==0)
                {
                    return "Number is not prime";
                }
            }
            return "Number is prime";
        }

        public static void main(String[] args) {

            System.out.println("Write number: ");
            int N = sc.nextInt();
            sc.close();
            String a = isPrimeNumber(N);
            System.out.println(a);
        }
    }


