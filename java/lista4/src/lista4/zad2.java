package lista4;
import java.util.Random;

public class zad2 {
	public static void main(String[] args) {
	Random rand = new Random();
	int[][] tab=new int[7][7];
	for(int j=0; j<7; j++) {
	for(int i=0; i<7; i++) {
		tab[i][j]=rand.nextInt(100);
	}
	}
	//wypisanie macierzy
	for(int j=0; j<tab.length; j++) {
	for (int i = 0; i < tab.length; i++)
	System.out.printf("%4d",tab[i][j]);
	System.out.println();
	}
		for(int j=0; j<tab.length; j++) {
			int max=tab[0][0], min=tab[0][0];
			for (int i = 0; i < tab.length; i++) {
			if(tab[j][i]<min)
				min=tab[j][i];
			else if(tab[j][i]>max)
				max=tab[j][i];
		}
		System.out.println("Maksimum w "+(j+1)+" kolumnie to " +max+" ");
		System.out.println("Minimum w "+(j+1)+" kolumnie to " +min+" ");
	}
		int max=tab[0][0], min=tab[0][0];
		for(int j=0; j<tab.length; j++) {
			for (int i = 0; i < tab.length; i++) {
			if(tab[j][i]<min)
				min=tab[j][i];
			else if(tab[j][i]>max)
				max=tab[j][i];
		}
		}
		System.out.println("Maksimum to: " +max);
		System.out.println("Minimum to: " +min);
		double suma=0;
	for(int j=0; j<tab.length; j++) {
			for (int i = 0; i < tab.length; i++) {
			suma+=tab[j][i];	
			}
	}
	System.out.println("Srednia arytmetyczna to "+(suma/49));
	int x=0, y=0;
	for(int j=0; j<tab.length; j++) {
		for (int i = 0; i < tab.length; i++) {
			if(tab[j][i]<(suma/49))
				x++;
			else if(tab[j][i]>(suma/49))
				y++;
		}
	}
		System.out.println("Ilosc elementow nizszych od sredniej to: "+x);
		System.out.println("Ilosc elementow nizszych od sredniej to: "+y);
		int[][] tab2=new int[7][7];
		for(int j=0; j<tab.length; j++) {
			for (int i = 0; i < tab.length; i++) {
				 tab2[i][j] = tab[tab.length - 1 - i][tab.length - 1 - j];
			}
		}
		for(int j=0; j<tab.length; j++) {
			for (int i = 0; i < tab.length; i++)
		    System.out.printf("%4d",tab2[i][j]);
			System.out.println();
			}
}
}