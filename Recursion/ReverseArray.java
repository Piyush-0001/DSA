package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    static int[] reverseArray(int arr[]){
        int n = arr.length;
        int rev [] = new int[n];
        for(int i=0; i<n; i++){
            rev[i] = arr[n-i-1];
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int res[] = reverseArray(a);
        // for (int  i : res) {
        //     System.out.print(i + " ");
        // }
        System.out.print(Arrays.toString(res));
        sc.close();
    }
}
