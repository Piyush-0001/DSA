package Arrays;

import java.util.Scanner;

public class LinearSearch {
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
            if(a[i] == target){
                System.out.println("the element found at index "+i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("the element not found");
        }
        sc.close();
    }
}
