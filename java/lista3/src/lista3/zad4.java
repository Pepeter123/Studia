package lista3;
import java.util.Scanner;
import java.util.ArrayList;


public class zad4 {
	static public void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Podaj liczby:");
	ArrayList<Integer> arr=new ArrayList<Integer>();
	for(int i=0; ; i++) {
		int a;
		a=sc.nextInt();
		if(a==5)break;
		arr.add(a);
	}
	int b=1;
	for(int i=0; i<arr.size(); i++) {
	b*=arr.get(i);
	}
	System.out.println("Iloczyn podanych liczb to: "+b);
}
}
