package Arrays;

import java.util.Scanner;
import java.util.Vector;

public class SpiralMatrixOptimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        Vector<Integer> v = new Vector<>();
        int top = 0;
        int left = 0;
        int bottom = n - 1;
        int right = n - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                v.add(a[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                v.add(a[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    v.add(a[bottom][i]);
                }

                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    v.add(a[i][left]);
                }
                left++;
            }
        }
        for (int i : v) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
