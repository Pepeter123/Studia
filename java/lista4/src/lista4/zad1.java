package lista4;
import java.util.Random;


public class zad1 {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] tab=new int[30];
		int[] tab2=new int[30];
		for(int i=0; i<30; i++) {
		tab[i]=rand.nextInt(52)+99;
		}
		for(int j=0; j<30; j++) {
			tab2[j]=tab[j];
		}
		for(int j=0; j<tab.length; j++) {
			System.out.printf("%4d",tab2[j]);
			System.out.print(" ");
			}	
		
		
System.out.println();
		for(int j=0; j<tab2.length; j++) {
			System.out.printf("%4d",tab2[j]);
			System.out.print(" ");
			}	
	}
}
