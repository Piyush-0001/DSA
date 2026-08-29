package Arrays;

import java.util.Scanner;

public class RearrangeArrayBySign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int temp[] = new int[n];
        int posIndex = 0;
        int negIndex = 1;
        for(int i=0; i<n; i++){
            if(a[i] > 0){
                temp[posIndex] = a[i];
                posIndex += 2;
            }else{
                temp[negIndex] = a[i];
                negIndex += 2;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(temp[i] + " ");
        }
        sc.close();
    }
}
