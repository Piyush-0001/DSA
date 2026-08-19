package Arrays;

import java.util.Scanner;

public class NumberAppearOnce {

    static void numberAppearedOnce(int a[], int n){
        for(int i=0; i<n; i++){
            int num = a[i];
            int count = 0;
            for(int j=0; j<n; j++){
                if(a[j] == num){
                    count ++;
                }
            }
            if(count == 1){
                System.out.println(num);
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
