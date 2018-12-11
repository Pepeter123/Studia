package lista3;

import java.util.Scanner;

import java.math.*;

public class Pow3lessThan {
	public static void main(String[] args) {
		int power;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		power = sc.nextInt();
		sc.close();

		if (power < 0) {
			System.out.println("Za mala liczba");
			System.exit(-1);
		} else {
			for (int i = 0; i < power; i++) {
				int value = (int) Math.pow(3, i);
				if (i == 0) {
					i = 1;
				}
				if (value <= power - 1) {

					//for (j = 0; j < power; j++)
						System.out.println("3 do potegi " + i + " = " + value);
				}
			}

		}

	}
}