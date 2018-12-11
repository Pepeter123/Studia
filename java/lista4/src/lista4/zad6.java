package lista4;

public class zad6 {
	public static void main(String[] args) {
		char[] arr = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[][] tab = new char[2][13];
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[0].length; j++) {
				tab[i][j] = arr[j];
			if (i == 1)
				tab[i][j] = arr[arr.length / 2 * i + j];
			}
		}
		for(int j=0; j<2; j++) {
			System.out.println();
			for (int i = 0; i <13; i++) {
			System.out.print(tab[j][i]);
			}
			}
		System.out.println();
		System.out.println("Dlugosc tablicy: "+arr.length);
	}
}