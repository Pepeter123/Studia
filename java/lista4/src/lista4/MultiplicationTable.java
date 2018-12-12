package lista4;

public class MultiplicationTable {
	public static void main(String[] args) {
		int[][] mulTable = new int[15][15];
		int[][] avgTable = new int[1][15];

		for (int i = 0; i < mulTable.length; i++) {
			for (int j = 0; j < mulTable.length; j++) {
				mulTable[i][j] = ((i + 1) * (j + 1));
			}
		}

		for (int i = 0; i < mulTable.length; i++) {
			for (int j = 0; j < mulTable.length; j++) {
				System.out.printf("%4d", mulTable[i][j]);
			}
			System.out.println();
		}

	/*
		 	for (int[] ints : mulTable) {
            System.out.print("[ ");
            for (int j = 0; j < mulTable.length; j++) {
                System.out.printf("%4d", ints[j]);
            }
            System.out.println("]");
        }
	*/
		System.out.print("\n[ ");
		for (int i = 0; i < avgTable[0].length; i++)
			System.out.printf("%4d", (int) getAverage(mulTable, i));
		System.out.println("]");
	}
 	public static double getAverage(int[][] arr, int numberOfRow) {
		double sum = 0.0;
 		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				sum += arr[j][numberOfRow];
			}
		}
		return (sum / Math.pow(arr.length, 2));
		
	}
}
