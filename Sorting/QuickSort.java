package Sorting;

import java.util.Scanner;

public class QuickSort {

    static int partition(int a[], int lb, int ub) {
        int pivot = a[lb];
        int start = lb+1;
        int end = ub;
        while (start <= end) {
            while (start <= ub && a[start] < pivot) {
                start++;
            }
            while (a[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        a[lb] = a[end];
        a[end] = pivot;
        return end;
    }

    static void quickSort(int a[], int lb, int ub){
        if(lb < ub){
            int lock = partition(a, lb, ub);
            quickSort(a, lb, lock-1);
            quickSort(a, lock+1, ub);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        quickSort(a, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(a[i] +" ");
        }
        sc.close();
    }
}
