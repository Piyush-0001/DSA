package Arrays;

import java.util.Scanner;

public class SetMatrixZeroBrute {

    static void markRow(int i, int a[][]) {
        for (int j = 0; j < a[i].length; j++) {
            if (a[i][j] != 0) {
                a[i][j] = -1;
            }
        }
    }

    static void markCol(int j, int a[][]) {
        for (int i = 0; i < a.length; i++) {
            if (a[i][j] != 0) {
                a[i][j] = -1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 0) {
                    markRow(i, a);
                    markCol(j, a);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == -1) {
                    a[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
