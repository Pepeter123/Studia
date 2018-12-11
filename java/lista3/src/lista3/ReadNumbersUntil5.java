package lista3;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadNumbersUntil5 {
	public static void main(String[] args) {

		int i = 0;
		ArrayList<Integer> array = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Podaj liczbe <cyfra 5 konczy wstawianie>");

		while (sc.hasNextInt()) {
			int val = sc.nextInt();
			if (val != 5)
				array.add(val);
			else if (val == 5) {
				multiply(array);
			}
		}

	}

	public static void multiply(ArrayList<Integer> arr) {
		int val = 1;
		for (Integer i : arr)
			val *= i;
		System.out.println("Przemnozona wartosc poanych liczb to: "+ val);
	}
}

