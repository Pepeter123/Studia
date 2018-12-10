package lista6;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/*
 * 
 * 
 * Program wype³nia tablicê 10x10 losowymi wartosciami i zapisuje je w excelu
 * 
 * 
 */
public class RandomArrayToCsv {
	public static void main(String[] args) throws IOException {
		PrintWriter zapis = new PrintWriter("zad4.csv");
		
		int i = 10, j = 10, a = 0, b = 0;
		int[][] tab = new int[i][j];
		Random rand = new Random();

		for (a = 0; a < i; a++)
			for (b = 0; b < j; b++) {
				tab[a][b] = (rand.nextInt(9)+1);
			}

		for (a = 0; a < i; a++) {
			for (b = 0; b < j; b++) {
				if (b == 9) System.out.print(tab[a][b] + ";");
				else System.out.print(tab[a][b] + ",");
			}	
			System.out.println();
		}
		
		for (a = 0; a < i; a++) {
			for (b = 0; b < j; b++) {
				if (b == 9) zapis.print(tab[a][b] + ";");
				else zapis.print(tab[a][b] + ",");
			}	
			zapis.println();
		}
		zapis.close();
		
	}
}