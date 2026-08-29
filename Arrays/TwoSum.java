package Arrays;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        boolean found = false;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i] + a[j] == target){
                    found = true;
                    break;
                }
            }
            if(found){
            System.out.println("target sum is found");
            break;
            }
        }
        
        if(!found){
            System.out.println("not found");
        }
        sc.close();
    }
}
