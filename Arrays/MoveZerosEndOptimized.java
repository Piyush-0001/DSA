package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosEndOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int j = 0;
        for(int i=0; i<n; i++){
            if(a[i] != 0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
        sc.close();
    }
}
