package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayZeroSum {

    static int longestSubArrayZeroSum(int a[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxlength = 0;

        for(int i=0; i<a.length; i++){
            sum = sum + a[i];
            if(sum == 0){
                maxlength = i + 1;
            }
            else if(map.containsKey(sum)){
                maxlength = Math.max(maxlength, i - map.get(sum));
            }
            else{
                map.put(sum, i);
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
        System.out.println("the longest subarray of sum zero is "+longestSubArrayZeroSum(a));
        sc.close();
    }
}
