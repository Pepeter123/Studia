package lista6;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class FromFileToArray {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("zad4.csv"));

		
		@Override
		public char readLine() {
			
		}
		
		
		
		System.out.println(br.readLine());
		while (br.ready()) {
			/*if (br.read() == ',') {
				System.out.print(" ");
			} 
			else if (br.read() == ';') {
				System.out.println("\n");
				System.out.println();
			}*/
			//System.out.print(br.read());
		}

		br.close();
		/*
		 * int i = 10, j = 10, a = 0, b = 0; int[][] array = new int[i][j]; for(int a =
		 * 0; a < i; a++ ) { for(int bv = 0; b < j; b++) {
		 * 
		 * } }
		 */

	}

}
