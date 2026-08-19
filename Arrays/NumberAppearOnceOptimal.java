package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class NumberAppearOnceOptimal {

    static void numberAppearedOnce(int a[], int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:a){
            map.put(i, map.getOrDefault(i, 0)+1);// Get current count (or 0 if new) and add 1
        }
        for(int i:a){
            if(map.get(i) == 1){ // Check if the number appeared exactly once
                System.out.println(i + " appeared once");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        numberAppearedOnce(a, n);
        sc.close();
    }
}
