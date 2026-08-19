package Arrays;

import java.util.Scanner;

public class LongestSubarrayOptimal {

    static int longestSubArray(int a[] , int k){
        int n = a.length;
        int maxlength = 0;
        int left=0, right=0;
        int sum = a[0];
        while(right < n){
            while(left <= right && sum > k){
                sum = sum - a[left];
                left++;
            }
            if(sum == k){
                maxlength = Math.max(maxlength, right-left+1);
            }
            right++;
            if(right < n){
                sum = sum + a[right];
            }
        }
        return maxlength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println("the longest subarray is "+ longestSubArray(a, k));
        sc.close();
    }
}
