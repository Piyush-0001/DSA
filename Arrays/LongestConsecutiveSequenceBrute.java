package Arrays;

import java.util.Scanner;

public class LongestConsecutiveSequenceBrute {

    static void longestConsecutiveSequence(int a[]){
        int n = a.length;
        int longest = 1;
        for(int i=0; i<n; i++){
            int x = a[i];
            int count = 1;
            while(linearSearch(a, x+1)){
                x = x + 1;
                count = count + 1;
            }
            if(count > longest){
                longest = count;
            }
        }
        System.out.println("the longest consecutive sequence is "+longest);
    }
    static boolean linearSearch(int a[], int target){
        for(int i=0; i<a.length; i++){
            if(a[i] == target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        longestConsecutiveSequence(a);
        sc.close();
        
    }
}
