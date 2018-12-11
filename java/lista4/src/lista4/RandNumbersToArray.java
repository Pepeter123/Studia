package lista4;

import java.util.Random;

public class RandNumbersToArray {
	public static void main(String[] args) {

		int tab[] = new int[30];
		Random r = new Random();

		int i;
		for (i = 0; i < 30; i++) {
			tab[i] = r.nextInt(52) + 99;
		}

		for (i = 0; i < 30; i++) {
			System.out.println(tab[i]);
		}
		int tab2[] = tab.clone();

		System.out.println("\nKopia: ");
		for (i = 0; i < 30; i++) {
			System.out.println(tab2[i]);
		}
	}
}
