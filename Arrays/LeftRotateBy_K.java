package Arrays;

import java.util.Scanner;

public class LeftRotateBy_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k = k % n;
        int temp[] = new int[k];
        for(int i=0; i<k; i++){
            temp[i] = a[i];
        }

        for(int i=k; i<n; i++){
            a[i-k] = a[i];
        }
        for(int i=n-k; i<n; i++){
            a[i] = temp[i-(n-k)];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
