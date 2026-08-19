package Arrays;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean missing = false;
        for(int i=0; i<n; i++){
            boolean found = false;
            for(int j=0; j<n; j++){
                if(a[j] == i){
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("the number missing is "+i);
                missing = true;
            }
        }
        if(!missing){
            System.out.println("no missing numbers found");
        }
        sc.close();
    }
}
