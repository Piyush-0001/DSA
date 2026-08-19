package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array 1: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the size of array 2: ");
        int m = sc.nextInt();
        int b[] = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Set<Integer> set = new HashSet<>();

        for (int num : a) {
            set.add(num);
        }

        for (int num : b) {
            set.add(num);
        }

        System.out.println("union of two arrays are: "+set);
        sc.close();
    }
}
