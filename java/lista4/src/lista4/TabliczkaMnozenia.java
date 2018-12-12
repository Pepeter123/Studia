package lista4;

public class TabliczkaMnozenia {
    public static void main(String[] args) {
        int[][] tab = new int[15][15];
        int[] tab2 = new int[15];
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                tab[i][j] = (i + 1) * (j + 1);
            }
        }
        arrPrint(tab); // wypisuje macierz
        tab2 = arrColumnMean(tab);
        System.out.println();
        System.out.print("[");
        for (int n = 0; n < 15; n++) {
            System.out.printf("%3d ", tab2[n]);
        }
        System.out.println(" ]");

    }

///////////////////////////////////////////////
    public static void arrPrint(int arr[][]) {
        System.out.println();
        for (int i = 0; i < 15; i++) {
            System.out.print("[");
            for (int j = 0; j < 15; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println(" ]");
            System.out.println();
        }
    }

///////////////////////////////////////////////
    public static int[] arrColumnMean(int arr[][]) {
        int[] tmp = new int[15];
        for (int i = 0; i < 15; i++) {
            tmp[i] = 0;
            for (int j = 0; j < 15; j++) {
                tmp[i] += arr[i][j];
            }
            tmp[i] /= 15;
        }
        return tmp;
    }
///////////////////////////////////////////////
}