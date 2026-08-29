package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {

    static int majorityElement(int a[]){
        int n = a.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : a){
            map.put(i, map.getOrDefault(i, 0)+1);
            if(map.get(i) > n/2){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(majorityElement(a));
        sc.close();
    }
}
