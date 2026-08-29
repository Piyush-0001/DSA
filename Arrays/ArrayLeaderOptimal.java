package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLeaderOptimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> leader = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > max) {
                leader.add(a[i]);
                max = a[i];
            }
        }
        Collections.reverse(leader);
        System.out.print(leader);
        sc.close();
    }
}
