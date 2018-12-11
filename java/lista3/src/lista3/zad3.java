package lista3;
import java.util.Scanner;
import java.util.Random;

public class zad3 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random r = new Random(); 
int a = r.nextInt(200) + 1;
//System.out.println(a);
System.out.println("Podaj liczbe z zakresu 1-200:");
int b;
b=sc.nextInt();
while(b!=a) {
if(b>a)	{
	System.out.println("Podana liczba jest zbyt wysoka");
	b=sc.nextInt();
}
if(b<a) {
	System.out.println("Podana liczba jest zbyt niska");
	b=sc.nextInt();
}
}
System.out.println("Zgadles liczbe!");
}
}