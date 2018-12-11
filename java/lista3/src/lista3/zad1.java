package lista3;
import java.util.ArrayList;
import java.util.Scanner;

public class zad1 {
	static public void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int x=1;
	System.out.println("Podaj liczbe:");
	x=sc.nextInt();
	sc.close();
	int len= Integer.toString(x).length();
	int[] newArray=new int[len];
	for (int i=0 ; i < len ; i++)
	{
	   newArray[i] = x%10;
	   x/=10;
	}
	double p=0, np=0 ,m=0 ,n=0, sr=0;
	for (int j = 0  ; j <len ; j++)
	{
		if((newArray[j]%2)==0)
		{
		   p+=newArray[j];
	 	   m++;
		}
	}
	for (int j = 0  ; j <len ; j++)
	   if((newArray[j]%2)!=0)
	     {
	       np+=newArray[j];
	       n++;
	     }
	sr=((np/n)/(p/m));
	//czy pierwsza
	if(sr<1)
	System.out.println(sr+" nie jest liczba pierwsza");
	for (int j = 2  ; j < sr ; j++)
	{
		if((sr%j)!=0)
			System.out.println(sr+" jest liczba pierwsza");
		else
			System.out.println(sr+" nie jest liczba pierwsza");
	}
	}
}
