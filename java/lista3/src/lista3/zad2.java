package lista3;
import java.util.Scanner;

public class zad2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a;
	System.out.println("Podaj liczbe calkowita:");
	a=sc.nextInt();
	System.out.print("Dzielniki liczby "+a+" to: ");
	for(int i=1; i<=a; i++){
	if((a%i)==0)
	System.out.print(+i+",");
	}
}
}