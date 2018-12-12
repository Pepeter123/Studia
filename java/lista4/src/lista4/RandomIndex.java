package lab4;

import java.util.Random;

public class RandomIndex {

	public static void main(String[] args) {
		Random rand = new Random();
		final int SIZE = 40;
		int[] arr = new int[SIZE];

		for (int i = 0; i < arr.length; i++) {
			if (i >= 0 && i <= 10)
				arr[i] = rand.nextInt(5) + 1;
			else if (i >= 11 && i <= 20)
				arr[i] = rand.nextInt(5) +6;
			else if (i >= 21 && i <= 30)
				arr[i] = rand.nextInt(45) + 11;
			else if (i >= 31 && i < 40)
				arr[i] = rand.nextInt(16) + 60;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
