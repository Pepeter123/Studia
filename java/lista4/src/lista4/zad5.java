package lista4;

import java.util.Random;

public class zad5 {
	public static void main(String[] args) {
		int[] tab = new int[40];
		Random rand = new Random();
		for (int i = 0; i < 40; i++) {
			if ((i <= 10) && (i>=0)) {
			tab[i]=rand.nextInt(5)+1;
			}
			if ((i <= 20) && (i>=11)) {
				tab[i]=rand.nextInt(5)+6;
			}
			if ((i <= 30) && (i>=21)){
				tab[i]=rand.nextInt(45)+11;
			}
			if ((i <= 40) && (i>=31)){
				tab[i]=rand.nextInt(16)+60;
			}
		}
		
			for (int i = 0; i < tab.length; i++) {
		    System.out.print(tab[i] + "  ");
			System.out.println();
			}
	}
}
