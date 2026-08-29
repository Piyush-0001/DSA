package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSumBetterSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean found = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int complement = target - a[i];
            if(map.containsKey(complement)){
                System.out.println("target sum found");
                System.out.println("indices: " + map.get(complement) + " and " + i);
                System.out.println("values: " + complement + " + " + a[i]);
                found = true;
                break;
            }
            map.put(a[i], i);
        }
        if(!found){
            System.out.println("target sum not found");
        }
        sc.close();
    }
}
