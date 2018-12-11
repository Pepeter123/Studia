package lista3;
import java.util.Scanner;

public class zad5 {
	static public void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Podaj liczbe nieujemna:");
	int a;
	a=sc.nextInt();
	if(a<0) {
	System.out.println("Podaj liczbe nieujemna:");
	while(a<0)
	a=sc.nextInt();
	}
	int b=1;
	for(int i=0; ;i++) {
		b*=3;
		if(b<=a) System.out.println(b);
		else break;
	}
	if(a<3) System.out.println("brak liczb");
}
}
