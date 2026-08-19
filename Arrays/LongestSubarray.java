package Arrays;

import java.util.Scanner;

class LongestSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("enter the target value: ");
        int target = sc.nextInt();
        int maxlength = 0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum = sum + a[j];
                if(sum == target){
                    maxlength = Math.max(maxlength, j-i+1);
                }
            }
            
        }
        System.out.println("the longest subarray is "+maxlength);
        sc.close();
    }
    
}