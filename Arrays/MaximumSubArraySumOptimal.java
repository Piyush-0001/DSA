package Arrays;

import java.util.Scanner;

public class MaximumSubArraySumOptimal {

    static int maximumSubArraySum(int a[]){
        int n = a.length;
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum +a[i];
            if(sum > maxsum){
                maxsum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(maximumSubArraySum(a));
        sc.close();
    }
}
