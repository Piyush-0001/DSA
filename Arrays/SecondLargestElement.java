package Arrays;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(a[i] > largest){
                secondlargest = largest;
                largest = a[i];
            }else if(a[i] > secondlargest && a[i] != largest){
                secondlargest = a[i];
            }
        }
        System.out.println("secondlargest is " +secondlargest);
        sc.close();

    }
}
