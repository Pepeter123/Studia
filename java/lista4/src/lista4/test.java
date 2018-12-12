package lista4;

import java.util.Scanner;

public class test {
	static public void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1;
		System.out.println("Podaj liczbe:");
		x = sc.nextInt();
		sc.close();
		int len = Integer.toString(x).length();
		int[] newArray = new int[len];
		for (int i = 0; i < len; i++) {
			newArray[i] = x % 10;
			x /= 10;
		}
		for (int j = 0; j < len; j++) {
			System.out.println(newArray[j]);

		}
	}
}
