package Arrays;

import java.util.Scanner;

public class MoveZerosEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int temp[] = new int[a.length];
        int j = 0;
        for(int i=0; i<n; i++){
            if(a[i] != 0){
                temp[j] = a[i];
                j++;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(temp[i] + " ");
        }
        sc.close();
    }
}
