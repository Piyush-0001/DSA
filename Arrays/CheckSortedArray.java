package Arrays;

import java.util.Scanner;

public class CheckSortedArray {

    static boolean isSorted(int a[]){
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] > a[j]){
                    return false;
                }
            }
        }
        return true;
    }

    // optimal approach

    static boolean isSorted2(int a[]){
        for(int i=1; i<a.length; i++){
            if(a[i-1]> a[i] ){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        if(isSorted(a)){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
        sc.close();
    }
}
