package Arrays;

import java.util.Scanner;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum = sum + a[j];
                maxsum = Math.max(maxsum, sum);
            }
        }
        System.out.println(maxsum);
        sc.close();
    }
}
