package Sorting;

import java.util.Scanner;

public class MergeSort {

    static void mergesort(int a[], int lb, int ub){
        if(lb < ub){
            int mid = (lb + ub)/2;
            mergesort(a, lb, mid);
            mergesort(a, mid+1, ub);
            merge(a, lb, mid, ub);
        }
    }
    static void merge(int a[], int lb, int mid, int ub){
        int i=lb;
        int j=mid+1;
        int k=lb;
        int temp[] = new int[a.length];
        while (i <= mid && j <= ub) {
            if(a[i] <= a[j]){
                temp[k] = a[i];
                i++;
            }else{
                temp[k] = a[j];
                j++;
            }
            k++;
        }
        if(i > mid){
            while (j <= ub) {
                temp[k] = a[j];
                j++; k++;
            }
        }else{
            while (i <= mid) {
                temp[k] = a[i];
                i++; k++;
            }
        }
        for(int x=lb; x<=ub; x++){
            a[x] = temp[x];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        mergesort(a, 0, n-1);
        for(int i : a){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
