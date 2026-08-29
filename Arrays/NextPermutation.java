package Arrays;

import java.util.Scanner;

public class NextPermutation {

    public static void nextPermutation(int a[]) {
        int n = a.length;
        int index = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] < a[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            reverse(a, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > index; i--) {
            if (a[i] > a[index]) {
                swap(a, i, index);
                break;
            }
        }

        reverse(a, index + 1, n - 1);

    }

    private static void reverse(int arr[], int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        nextPermutation(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
