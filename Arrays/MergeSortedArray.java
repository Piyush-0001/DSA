package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array 1: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("enter the size of array 2: ");
        int m = sc.nextInt();
        int b[] = new int[m];
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int result [] = new int[a.length + b.length];
//System.arraycopy(sourceArray, sourcePosition,
//  destinationArray, destinationPosition, numberOfElements);
        System.arraycopy(a, 0, result, 0, n);
        System.arraycopy(b, 0, result, a.length, m);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}
