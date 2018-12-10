package lista6;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
/*
 * 
 * 
 * Program odczytuje tylko liczby z excela i zapisuje je w tablicy 
 * 
 * 
 */
public class FromCsvToArray {
	public static void main(String[] agrs) throws IOException {
		Scanner in = new Scanner(new File("zad4.csv"));

		in.useDelimiter(Pattern.compile("[,;\\n]+"));

		int i = 10, j = 10, a = 0, b = 0;
		int[][] tab = new int[i][j];

		for (a = 0; a < i; a++) {
			for (b = 0; b < j; b++) {
				if (in.hasNextInt()) {
					tab[a][b] = in.nextInt();
				}
				
			}
		}
		in.close();

		for (a = 0; a < i; a++) {
			for (b = 0; b < j; b++) {
					System.out.print(tab[a][b] + " ");
			}
			System.out.println();
		}

	}
}

