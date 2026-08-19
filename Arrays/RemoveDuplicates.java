package Arrays;

import java.util.Scanner;

public class RemoveDuplicates {

    static int removeduplicate(int a[]) {
        int temp[] = new int[a.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < k; j++) {
                if (a[i] == temp[j]) {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                temp[k] = a[i];
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            a[i] = temp[i];
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = removeduplicate(a);
        for (int i=0; i<k; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
