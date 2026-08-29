package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumOptimalSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int left = 0;
        int right = n-1;
        int target = sc.nextInt();
        boolean found = false;
        while(left < right){
            if(a[left] + a[right] == target){
                System.out.println("target sum found");
                found = true;
                break;
            }
            else if(a[left] + a[right] < target){
                left++;
            }else{
                right--;
            }
        }
        if(!found){
            System.out.println("target sum not found");
        }
        sc.close();
    }
}
