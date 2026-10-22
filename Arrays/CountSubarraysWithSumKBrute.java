package Arrays;

import java.util.Scanner;

public class CountSubarraysWithSumKBrute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int count = 0;
        int k = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum = 0;
                for(int m=i; m<=j; m++){
                    sum += a[m];
                }
                if(sum == k){
                    count++;
                }
            }
        }
        System.out.println("The number of subarrays is: "+count);
        sc.close();
    }
}
